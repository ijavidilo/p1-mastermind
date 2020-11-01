package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private Game game;
    private State state;
    private Map<StateValue, UseCaseController> controllers;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllers = new HashMap<StateValue, UseCaseController>();
        this.controllers.put(StateValue.CLOSE, new StartController(this.game, this.state));
        this.controllers.put(StateValue.OPEN, new ProposalController(this.game, this.state));
        this.controllers.put(StateValue.FINISHED, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public UseCaseController getController() {
        return this.controllers.get(this.state.getValueState());
    }

}
