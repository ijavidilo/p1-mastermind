package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.GameView;


public abstract class InGameController extends UseCaseController {

    private GameView gameView;

    InGameController(Game game, State state) {
        super(game, state);
        this.gameView = new GameView();
    }

    @Override
    public void control() {
        this.inGameControl();

        this.gameView.setAttempts(this.game.getAttempts());
        this.gameView.setWidth(this.getWidth());
        this.gameView.clearAllColors();
        this.gameView.clearAllResults();
        for (int i = 0; i < this.game.getAttempts(); i++) {
            this.gameView.setAllColors(this.game.getColors(i));
            this.gameView.setAllResults(this.game.getBlacks(i), this.game.getWhites(i));
        }
        this.gameView.writeGame();
        if (this.game.isWinner()) {
            this.gameView.writeWinner();
        } else if (this.game.isLooser()) {
            this.gameView.writeLooser();
        }
    }

    protected abstract void inGameControl();

}
