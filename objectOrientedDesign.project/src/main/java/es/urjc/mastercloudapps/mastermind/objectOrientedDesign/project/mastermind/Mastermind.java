package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View;

public class Mastermind {

    private Game game;

    private View view;

    private Mastermind() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
