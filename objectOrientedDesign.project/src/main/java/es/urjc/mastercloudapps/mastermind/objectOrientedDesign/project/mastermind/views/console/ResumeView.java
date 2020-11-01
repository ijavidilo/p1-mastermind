package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.YesNoDialog;

class ResumeView {

    boolean interact(ResumeController resumeController) {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            resumeController.clear();
        } else {
            resumeController.next();
        }
        return newGame;
    }

}
