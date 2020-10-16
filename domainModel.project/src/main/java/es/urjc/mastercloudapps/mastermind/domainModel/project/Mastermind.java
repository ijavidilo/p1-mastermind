package es.urjc.mastercloudapps.mastermind.domainModel.project;

public class Mastermind {

    private Turn turn;

    public static final int NUM_PLAYERS = 2;
    public static final int NUM_SECRET_COMBINATION = 4;

    public void start() {
        do {
            Message.MASTERMIND_RULES.writeln();
            Message.NUM_PLAYERS.writeln();
            this.turn = new Turn(new SecretCombination());
            Message.SECRET_CREATED.writeln();

            do {
                ProposedCombination proposedCombination = new ProposedCombination();

                Message.READ_COMBINATION.writeln();
                this.turn.addCombination(proposedCombination.createRandomCombination());

                this.turn.increaseAttempt();
                Message.NUM_ATTEMPTS.writeln();

                Message.CHECK_RESULT.writeln();
            } while ((!this.turn.isMaxTurn()) || (this.turn.isWinner()));

            Message message = Message.GAME_OVER;
            if (this.turn.isWinner()) {
                message = Message.IS_WINNER;
            }
            message.writeln();
        } while (this.turn.isWinner());
    }

    public static void main(String[] args) {
        new Mastermind().start();
    }

}
