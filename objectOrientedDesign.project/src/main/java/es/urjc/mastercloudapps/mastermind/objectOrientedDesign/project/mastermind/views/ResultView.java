package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

public class ResultView extends WithConsoleView {

    private PlayController playController;

    public ResultView(PlayController playController) {
        this.playController = playController;
    }

    public void writeln(int i) {
        this.console.writeln(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks", "" + this.playController.getBlacks(i))
                .replaceFirst("#whites", "" + this.playController.getWhites(i)));
    }

}