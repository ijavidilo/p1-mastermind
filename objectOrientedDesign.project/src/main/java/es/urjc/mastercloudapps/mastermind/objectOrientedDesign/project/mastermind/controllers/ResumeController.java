package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.ResumeView;

public class ResumeController extends UseCaseController {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void control() {
        if (new ResumeView().read()) {
            this.game.clear();
            this.state.reset();
        } else {
            this.state.next();
        }
    }

}
