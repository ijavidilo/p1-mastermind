package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.RedoController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.UndoController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Error;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;

import java.util.List;

public class PlayControllerImplementation extends PlayController {

    private ProposalController proposalController;
    private UndoController undoController;
    private RedoController redoController;

    PlayControllerImplementation(Session session) {
        super(session);
        this.proposalController = new ProposalController(this.session);
        this.undoController = new UndoController(this.session);
        this.redoController = new RedoController(this.session);
    }

    @Override
    public Error addProposedCombination(List<Color> colors) {
        return this.proposalController.addProposedCombination(colors);
    }

    @Override
    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    @Override
    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    @Override
    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    @Override
    public List<Color> getColors(int position) {
        return this.proposalController.getColors(position);
    }

    @Override
    public int getBlacks(int position) {
        return this.proposalController.getBlacks(position);
    }

    @Override
    public int getWhites(int position) {
        return this.proposalController.getWhites(position);
    }

    @Override
    public boolean undoable() {
        return this.undoController.undoable();
    }

    @Override
    public void undo() {
        this.undoController.undo();
    }

    @Override
    public boolean redoable() {
        return this.redoController.redoable();
    }

    @Override
    public void redo() {
        this.redoController.redo();
    }

}