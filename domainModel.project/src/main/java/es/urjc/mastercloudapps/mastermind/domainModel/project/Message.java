package es.urjc.mastercloudapps.mastermind.domainModel.project;

enum Message {
    MASTERMIND_RULES("----- MASTERMIND ----- There are the mastermind rules... bla bla bla"),
    NUM_PLAYERS("#players: "),
    SECRET_CREATED("The code maker created correctly the secret combination.. "),
    NUM_ATTEMPTS("#attempts attempt(s): "),
    CHECK_RESULT(" --> #blacks blacks and #whites whites"),
    READ_COMBINATION("Propose a combination: "),
    IS_WINNER("You've won!!! ;-)"),
    GAME_OVER("You've lost!!! :-(");

    private String message;

    private Message(String message) {
        this.message = message;
    }

    void writeln() {
        Console.instance().writeln(this.message);
    }

}
