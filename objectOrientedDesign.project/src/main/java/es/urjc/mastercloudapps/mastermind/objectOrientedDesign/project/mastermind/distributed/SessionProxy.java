package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.FrameType;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.TCPIP;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.StateValue;

public class SessionProxy implements Session {

    private TCPIP tcpip;

    public SessionProxy(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }

}
