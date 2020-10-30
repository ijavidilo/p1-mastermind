package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;

public abstract class Command extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.Command {

    protected PlayController playController;

    protected Command(String title, PlayController playController) {
        super(title);
        this.playController = playController;
    }

}
