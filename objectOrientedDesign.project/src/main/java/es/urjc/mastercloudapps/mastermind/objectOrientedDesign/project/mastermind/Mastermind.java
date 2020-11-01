package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.UseCaseController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View;

public abstract class Mastermind {

    private Logic logic;
    private View view;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
        UseCaseController useCaseController;
        do {
            useCaseController = this.logic.getController();
            if (useCaseController != null) {
                this.view.interact(useCaseController);
            }
        } while (useCaseController != null);
    }

}