package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.StartView;

public class StartController extends UseCaseController {

    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void control() {
        this.state.next();
        new StartView().write(this.getWidth());
    }

}
