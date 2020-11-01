package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

public class StartView {

    public void write(int width) {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln(width);
    }

}
