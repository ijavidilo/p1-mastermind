package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;

public abstract class AcceptorController extends UseCaseController {

    AcceptorController(Session session) {
        super(session);
    }

    public abstract void accept(ControllersVisitor controllersVisitor);

}