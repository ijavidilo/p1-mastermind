package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.TCPIP;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.StateValue;

public class LogicProxy extends Logic {

    private TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);

        this.acceptorControllers.put(StateValue.INITIAL, new StartControllerProxy(this.session, this.tcpip));
        this.acceptorControllers.put(StateValue.IN_GAME, new PlayControllerProxy(this.session, this.tcpip));
        this.acceptorControllers.put(StateValue.FINAL, new ResumeControllerProxy(this.session, this.tcpip));
        this.acceptorControllers.put(StateValue.EXIT, null);
    }

    public void close() {
        this.tcpip.close();
    }

}