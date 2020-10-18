package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View;

public abstract class Mastermind {

    private Game game;
    private View view;
    private Logic logic;

    protected Mastermind() {
        this.game = new Game();
        this.view = this.createView(this.logic);
    }

    protected abstract View createView(Logic logic);

    protected void play() {
        this.view.interact();
    }

}