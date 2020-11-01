package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

    public SecretCombinationView() {
        super();
    }

    public void writeln(int length) {
        for (int i = 0; i < length; i++) {
            MessageView.SECRET.write();
        }
        this.console.writeln();
    }

}
