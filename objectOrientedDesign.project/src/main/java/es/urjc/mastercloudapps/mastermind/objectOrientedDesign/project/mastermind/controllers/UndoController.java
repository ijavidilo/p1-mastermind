package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;


import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;

public class UndoController extends UseCaseController {

    UndoController(Session session) {
        super(session);
    }

    void undo() {
        this.session.undo();
    }

    boolean undoable() {
        return this.session.undoable();
    }

}
