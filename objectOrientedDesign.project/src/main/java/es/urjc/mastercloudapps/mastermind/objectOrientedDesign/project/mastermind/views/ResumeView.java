package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.YesNoDialog;

public class ResumeView {

    public boolean read() {
        return new YesNoDialog().read(MessageView.RESUME.getMessage());
    }

}
