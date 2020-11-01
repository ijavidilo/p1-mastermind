package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.SessionImplementation;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.StateValue;

public class LogicImplementation extends Logic {

    public LogicImplementation() {
        this.session = new SessionImplementation();

        this.acceptorControllers.put(StateValue.INITIAL, new StartControllerImplementation(this.session));
        this.acceptorControllers.put(StateValue.IN_GAME, new PlayControllerImplementation(this.session));
        this.acceptorControllers.put(StateValue.FINAL, new ResumeControllerImplementation(this.session));
        this.acceptorControllers.put(StateValue.EXIT, null);
    }

}