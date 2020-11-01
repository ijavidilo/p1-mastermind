package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

public class GameView extends WithConsoleView {

    public GameView(PlayController playController) {
        this.console.writeln();
        new AttemptsView(playController).writeln();
        new SecretCombinationView(playController).writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController).write(i);
            new ResultView(playController).writeln(i);
        }
        if (playController.isWinner()) {
            this.console.writeln(MessageView.WINNER.getMessage());
        } else if (playController.isLooser()) {
            this.console.writeln(MessageView.LOOSER.getMessage());
        }
    }

}