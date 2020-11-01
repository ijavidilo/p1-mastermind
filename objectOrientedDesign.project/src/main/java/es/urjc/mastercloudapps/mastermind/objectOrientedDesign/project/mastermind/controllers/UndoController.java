package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.SessionImplementation;

public class UndoController extends UseCaseController {

    private SessionImplementation sessionImplementation;

    public UndoController(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    public void undo() {
        this.sessionImplementation.undo();
    }

    public boolean undoable() {
        return this.sessionImplementation.undoable();
    }

}