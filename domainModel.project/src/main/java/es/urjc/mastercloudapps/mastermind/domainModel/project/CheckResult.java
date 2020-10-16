package es.urjc.mastercloudapps.mastermind.domainModel.project;

class CheckResult {

    public static final int BLACK_PEGS_TO_WIN = 4;
    private int blacks;
    private int whites;

    CheckResult() {
        this.blacks = 0;
        this.whites = 0;
    }

    CheckResult(int blacks, int whites) {
        this.blacks = blacks;
        this.whites = whites;
    }

    CheckResult getResult(SecretCombination secretCombination, ProposedCombination proposedCombination) {
        int blacks = 0;
        for (CodePegsColor color : CodePegsColor.values()) {
            if (secretCombination.getCombination().contains(color.toString())) {
                blacks++;
            }
        }

        int whites = 0;
        for (CodePegsColor color : CodePegsColor.values()) {
            if (proposedCombination.getCombination().contains(color.toString())) {
                whites++;
            }
        }

        return new CheckResult(blacks, whites);
    }

    boolean isWinner() {
        return this.blacks == CheckResult.BLACK_PEGS_TO_WIN;
    }

}
