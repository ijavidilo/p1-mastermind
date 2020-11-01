package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

    private PlayController playController;

    public AttemptsView(PlayController proposalController) {
        this.playController = proposalController;
    }

    public void writeln() {
        this.console.writeln(
                MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" +
                        this.playController.getAttempts()));
    }

}
