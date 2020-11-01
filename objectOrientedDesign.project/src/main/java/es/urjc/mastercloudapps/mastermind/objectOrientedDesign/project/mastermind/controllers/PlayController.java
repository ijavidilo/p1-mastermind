package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Error;

import java.util.List;

public abstract class PlayController extends AcceptorController {

    protected PlayController(Session session) {
        super(session);
    }

    public abstract Error addProposedCombination(List<Color> colors);

    public abstract boolean isWinner();

    public abstract boolean isLooser();

    public abstract int getAttempts();

    public abstract List<Color> getColors(int position);

    public abstract int getBlacks(int position);

    public abstract int getWhites(int position);

    public abstract void undo();

    public abstract boolean undoable();

    public abstract void redo();

    public abstract boolean redoable();

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}