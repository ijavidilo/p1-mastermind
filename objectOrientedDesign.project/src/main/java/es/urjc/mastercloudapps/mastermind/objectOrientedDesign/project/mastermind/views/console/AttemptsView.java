package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.MessageView;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

    private PlayController playController;

    AttemptsView(PlayController proposalController) {
        this.playController = proposalController;
    }

    void writeln() {
        this.console.writeln(
                MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" +
                        this.playController.getAttempts()));
    }

}
