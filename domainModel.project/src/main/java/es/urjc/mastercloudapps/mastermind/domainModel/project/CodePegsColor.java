package es.urjc.mastercloudapps.mastermind.domainModel.project;

enum CodePegsColor {
    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    ORANGE('o'),
    PURPLE('p'),
    NULL_COLOR;

    private char color_initial;

    private CodePegsColor() {
    }

    private CodePegsColor(char color_initial) {
        this.color_initial = color_initial;
    }

}
