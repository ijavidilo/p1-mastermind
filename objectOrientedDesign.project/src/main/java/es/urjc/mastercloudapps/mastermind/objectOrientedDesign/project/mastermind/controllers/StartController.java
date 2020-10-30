package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;

public class StartController extends UseCaseController implements AcceptorController {

    public StartController(Session session) {
        super(session);
    }

    public void start() {
        this.session.next();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
