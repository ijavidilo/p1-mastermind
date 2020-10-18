package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.ProposedCombination;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Result;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.SecretCombination;

public class Logic {

    private Game game;
    private StartController startController;
    private ProposalController proposalController;
    private ResumeController resumeController;

    public Logic() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
    }

    public SecretCombination getSecretCombination() {
        return this.startController.getSecretCombination();
    }

    public void clear() {
        this.resumeController.clear();
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposalController.addProposedCombination(proposedCombination);
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.proposalController.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.proposalController.getResult(position);
    }

}
