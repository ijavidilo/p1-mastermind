package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.YesNoDialog;

class ResumeView extends SubView {

    ResumeView(Logic logic) {
        super(logic);
    }

    boolean interact() {
        MessageView.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.logic.clear();
        }
        return newGame;
    }

}
