package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Error;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.*;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.*;

import java.util.List;

public class ProposalController extends InGameController {

    public ProposalController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void inGameControl() {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView().read();
            error = this.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
    }

    private Error addProposedCombination(List<Color> colors) {
        Error error = null;
        if (colors.size() != Combination.getWidth()) {
            error = Error.WRONG_LENGTH;
        } else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) == null) {
                    error = Error.WRONG_CHARACTERS;
                } else {
                    for (int j = i + 1; j < colors.size(); j++) {
                        if (colors.get(i) == colors.get(j)) {
                            error = Error.DUPLICATED;
                        }
                    }
                }
            }
        }
        if (error == null) {
            this.game.addProposedCombination(colors);
            if (this.game.isWinner() || this.game.isLooser()) {
                this.state.next();
            }
        }
        return error;
    }

}
