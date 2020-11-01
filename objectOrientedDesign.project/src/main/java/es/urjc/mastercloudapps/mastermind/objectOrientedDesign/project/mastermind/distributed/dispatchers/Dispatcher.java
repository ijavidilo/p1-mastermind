package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.AcceptorController;

public abstract class Dispatcher {

    protected AcceptorController acceptorController;
    protected TCPIP tcpip;

    public Dispatcher(AcceptorController acceptorController) {
        this.acceptorController = acceptorController;
    }

    public abstract void dispatch();

    public void associate(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

}
