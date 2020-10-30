package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;

public class ResumeController extends UseCaseController implements AcceptorController {

    public ResumeController(Session session) {
        super(session);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.isNewGame();
        } else {
            this.session.next();
        }
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
