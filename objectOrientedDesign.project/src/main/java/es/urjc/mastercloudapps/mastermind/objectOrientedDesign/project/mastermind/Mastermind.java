package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.UseCaseController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Mastermind {

    private Game game;
    private State state;
    private Map<StateValue, UseCaseController> controllers;

    Mastermind() {
        this.game = new Game();
        this.state = new State();

        this.controllers = new HashMap<StateValue, UseCaseController>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
        this.controllers.put(StateValue.IN_GAME, new ProposalController(this.game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    void play() {
        UseCaseController controller;
        do {
            controller = this.controllers.get(this.state.getValueState());
            if (controller != null) {
                controller.control();
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
