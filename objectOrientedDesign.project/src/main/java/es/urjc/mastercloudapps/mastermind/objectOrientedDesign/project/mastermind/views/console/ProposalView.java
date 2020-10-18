package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.ProposedCombination;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

    private ProposalController proposalController;
    private SecretCombinationView secretCombinationView;

    ProposalView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.proposalController.addProposedCombination(proposedCombination);
        this.console.writeln();
        MessageView.ATTEMPTS.writeln(this.proposalController.getAttempts());
        secretCombinationView = new SecretCombinationView();
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.proposalController.getAttempts(); i++) {
            new ProposedCombinationView(this.proposalController.getProposedCombination(i)).write();
            new ResultView(this.proposalController.getResult(i)).writeln();
        }
        if (this.proposalController.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.proposalController.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
