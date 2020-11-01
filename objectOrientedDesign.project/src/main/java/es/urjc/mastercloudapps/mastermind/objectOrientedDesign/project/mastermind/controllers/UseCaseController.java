package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.StateValue;

public abstract class UseCaseController {

    protected Session session;

    public UseCaseController(Session session) {
        this.session = session;
    }

    public int getWidth() {
        return this.session.getWidth();
    }

    public StateValue getValueState() {
        return this.session.getValueState();
    }

}
