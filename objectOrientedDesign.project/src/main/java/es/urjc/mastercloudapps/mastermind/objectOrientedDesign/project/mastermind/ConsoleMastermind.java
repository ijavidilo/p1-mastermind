package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView() {
        return new View();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}