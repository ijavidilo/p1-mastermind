package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;

public class PlayView {

    void interact(PlayController playController) {
        new PlayMenu(playController).execute();
    }

}