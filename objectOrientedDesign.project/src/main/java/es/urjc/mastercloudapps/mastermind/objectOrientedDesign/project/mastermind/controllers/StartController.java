package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.SecretCombination;

public class StartController extends Controller {

    public StartController(Game game) {
        super(game);
    }

    public SecretCombination getSecretCombination() {
        return this.game.getSecretCombination();
    }

}
