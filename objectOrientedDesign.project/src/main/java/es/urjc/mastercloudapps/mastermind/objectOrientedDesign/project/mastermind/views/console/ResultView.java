package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.MessageView;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

class ResultView extends WithConsoleView {

    private PlayController playController;

    ResultView(PlayController playController) {
        this.playController = playController;
    }

    void writeln(int i) {
        this.console.writeln(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks", "" + this.playController.getBlacks(i))
                .replaceFirst("#whites", "" + this.playController.getWhites(i)));
    }

}
