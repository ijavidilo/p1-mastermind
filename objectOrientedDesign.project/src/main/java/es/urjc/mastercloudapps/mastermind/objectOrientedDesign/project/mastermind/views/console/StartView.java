package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.MessageView;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

public class StartView extends WithConsoleView {

    private SecretCombinationView secretCombinationView;

    public void interact(StartController startController) {
        startController.start();
        this.console.writeln(MessageView.TITLE.getMessage());
        this.secretCombinationView = new SecretCombinationView(startController);
        this.secretCombinationView.writeln();
    }

}
