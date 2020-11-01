package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new LogicImplementation();
    }

    public static void main(String[] args) {
        new MastermindStandalone().play();
    }

}