package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.PlayControllerImplementation;

public class StateDispatcher extends Dispatcher {

    public StateDispatcher(PlayControllerImplementation playControllerImplementation) {
        super(playControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(this.acceptorController.getValueState().ordinal());
        System.out.println("    > StateDispatcher -> " + this.acceptorController.getValueState().ordinal());
    }

}
