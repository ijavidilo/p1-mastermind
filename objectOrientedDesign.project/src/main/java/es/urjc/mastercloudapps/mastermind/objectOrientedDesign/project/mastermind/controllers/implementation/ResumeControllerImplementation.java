package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    public ResumeControllerImplementation(Session session) {
        super(session);
    }

    @Override
    public void resume(boolean newGame) {
        if (newGame) {
            ((SessionImplementation) this.session).isNewGame();
        } else {
            ((SessionImplementation) this.session).next();
        }
    }

}