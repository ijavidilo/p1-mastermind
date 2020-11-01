package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.ProposedCombination;

class ProposalView {

    private SecretCombinationView secretCombinationView;

    boolean interact(ProposalController proposalController) {
        boolean newGame = false;

        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        proposalController.addProposedCombination(proposedCombination);

        MessageView.ATTEMPTS.writeln(proposalController.getAttempts());
        secretCombinationView = new SecretCombinationView();
        this.secretCombinationView.writeln();
        for (int i = 0; i < proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController.getProposedCombination(i)).write();
            new ResultView(proposalController.getResult(i)).writeln();
        }
        if (proposalController.isWinner()) {
            MessageView.WINNER.writeln();
            newGame = true;
            proposalController.next();
        } else if (proposalController.isLooser()) {
            MessageView.LOOSER.writeln();
            newGame = true;
            proposalController.next();
        }

        return newGame;
    }

}
