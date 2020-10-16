package es.urjc.mastercloudapps.mastermind.domainModel.project;

class ProposedCombination {

    private String proposedCombination;

    ProposedCombination() {
        createRandomCombination();
    }

    ProposedCombination(String proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public ProposedCombination createRandomCombination() {
        proposedCombination = Util.createRandomCombination();
        return new ProposedCombination(proposedCombination);
    }

    public String getCombination() {
        return this.proposedCombination;
    }

}
