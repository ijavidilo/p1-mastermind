package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;

public abstract class UseCaseController {

    protected Session session;

    UseCaseController(Session session) {
        this.session = session;
    }

    public int getWidth() {
        return this.session.getWidth();
    }

}
