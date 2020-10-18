package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.ProposedCombination;

class ProposalView extends SubView {

    private SecretCombinationView secretCombinationView;

    ProposalView(Logic logic) {
        super(logic);
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.logic.addProposedCombination(proposedCombination);

        MessageView.ATTEMPTS.writeln(this.logic.getAttempts());
        secretCombinationView = new SecretCombinationView();
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.logic.getAttempts(); i++) {
            new ProposedCombinationView(this.logic.getProposedCombination(i)).write();
            new ResultView(this.logic.getResult(i)).writeln();
        }
        if (this.logic.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.logic.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
