package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.DispatcherPrototype;

public class MastermindServer {

    private DispatcherPrototype dispatcherPrototype;
    private LogicServer logicServer;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        this.logicServer = new LogicServer();
        this.logicServer.createDispatchers(this.dispatcherPrototype);
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }

}
