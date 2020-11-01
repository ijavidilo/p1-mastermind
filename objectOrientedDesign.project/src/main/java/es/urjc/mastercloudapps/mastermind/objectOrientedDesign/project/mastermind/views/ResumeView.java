package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.YesNoDialog;

public class ResumeView {

    public void interact(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
    }

}
