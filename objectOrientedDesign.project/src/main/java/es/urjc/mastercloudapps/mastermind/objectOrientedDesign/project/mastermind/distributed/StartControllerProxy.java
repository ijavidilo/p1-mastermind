package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.FrameType;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.TCPIP;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;

public class StartControllerProxy extends StartController {

    private TCPIP tcpip;

    public StartControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void start() {
        this.tcpip.send(FrameType.START.name());
    }

}
