package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Combination;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.SessionImplementation;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Error;

import java.util.List;

public class ProposalController extends UseCaseController {

    private SessionImplementation sessionImplementation;

    public ProposalController(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    public Error addProposedCombination(List<Color> colors) {
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
            this.sessionImplementation.addProposedCombination(colors);
            if (this.sessionImplementation.isWinner()
                    || this.sessionImplementation.isLooser()) {
                this.sessionImplementation.next();
            }
        }
        return error;
    }

    public boolean isWinner() {
        return this.sessionImplementation.isWinner();
    }

    public boolean isLooser() {
        return this.sessionImplementation.isLooser();
    }

    public int getAttempts() {
        return this.sessionImplementation.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.sessionImplementation.getColors(position);
    }

    public int getBlacks(int position) {
        return this.sessionImplementation.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.sessionImplementation.getWhites(position);
    }

}