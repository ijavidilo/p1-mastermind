package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;

import java.util.HashMap;
import java.util.Map;

public class DispatcherPrototype {

    private TCPIP tcpip;
    private Map<FrameType, Dispatcher> dispatcherMap;

    public DispatcherPrototype() {
        this.tcpip = TCPIP.createServerSocket();
        this.dispatcherMap = new HashMap<FrameType, Dispatcher>();
    }

    public void add(FrameType frameType, Dispatcher dispatcher) {
        this.dispatcherMap.put(frameType, dispatcher);
        dispatcher.associate(this.tcpip);
    }

    public void serve() {
        FrameType frameType;
        do {
            String string = this.tcpip.receiveLine();
            frameType = FrameType.parser(string);
            System.out.println("Servidor> frameType -> "+ frameType);
            //System.out.println();
            if (frameType != FrameType.CLOSE) {
                this.dispatcherMap.get(frameType).dispatch();
            }
        } while (frameType != FrameType.CLOSE);
        System.out.println("Servidor> close connection");
        this.tcpip.close();
    }

}
