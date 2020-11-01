package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;

public class StartController extends UseCaseController {

    public StartController(Game game, State state) {
        super(game, state);
    }

    public void getSecretCombination() {
        this.game.getSecretCombination();
        this.state.next();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
