package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.FrameType;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.TCPIP;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Session;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Error;

import java.util.List;


public class PlayControllerProxy extends PlayController {

    private TCPIP tcpip;

    PlayControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public Error addProposedCombination(List<Color> colors) {
        this.tcpip.send(FrameType.PROPOSE_COMBINATION.name());
        this.tcpip.send(colors.size());
        for (Color color : colors) {
            this.tcpip.send(color);
        }
        Error error = this.tcpip.receiveError();
        return error;
    }

    @Override
    public boolean isWinner() {
        this.tcpip.send(FrameType.WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean isLooser() {
        this.tcpip.send(FrameType.LOOSER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    @Override
    public boolean undoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    @Override
    public boolean redoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public int getAttempts() {
        return 0;
    }

    @Override
    public List<Color> getColors(int position) {
        return null;
    }

    @Override
    public int getBlacks(int position) {
        return 0;
    }

    @Override
    public int getWhites(int position) {
        return 0;
    }

}
