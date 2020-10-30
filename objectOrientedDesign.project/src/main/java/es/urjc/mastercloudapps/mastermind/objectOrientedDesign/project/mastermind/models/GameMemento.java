package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameMemento {

    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;
    private int turn;

    public GameMemento(int turn) {
        this.turn = turn;
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.results = new ArrayList<Result>();
    }

    public void set(ProposedCombination proposedCombination, Result result) {
        this.proposedCombinations.add(proposedCombination);
        this.results.add(result);
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.proposedCombinations.get(position);
    }

    public Result getResult(int position) {
        return this.results.get(position);
    }

    public int getSize() {
        return proposedCombinations.size();
    }

    public int getTurn() {
        return this.turn;
    }

}
