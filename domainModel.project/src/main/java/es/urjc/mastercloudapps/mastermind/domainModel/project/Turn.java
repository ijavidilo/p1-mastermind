package es.urjc.mastercloudapps.mastermind.domainModel.project;

public class Turn {

    private static final int MAX_ATTEMPS = 10;

    private int attempts;
    private SecretCombination secretCombination;
    private ProposedCombination[] proposedCombinations;
    private CheckResult[] checkResults;

    Turn() {
        this.proposedCombinations = new ProposedCombination[Turn.MAX_ATTEMPS];
        this.checkResults = new CheckResult[Turn.MAX_ATTEMPS];
        this.attempts = 0;
    }

    Turn(SecretCombination secretCombination) {
        this.secretCombination = new SecretCombination();
    }

    public void addCombination(ProposedCombination proposedCombination) {
        this.proposedCombinations[this.attempts] = proposedCombination;
        this.checkResults[this.attempts] = this.checkResults[this.attempts].getResult(secretCombination, proposedCombination);
        this.attempts++;
    }

    public void increaseAttempt() {
        this.attempts = this.attempts++;
    }

    public boolean isMaxTurn() {
        return (this.attempts == MAX_ATTEMPS);
    }

    public boolean isWinner() {
        return this.checkResults[this.attempts - 1].isWinner();
    }

}
