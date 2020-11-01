package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.LogicImplementation;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers.*;

public class LogicServer extends LogicImplementation {

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.PROPOSE_COMBINATION, new ProposeCombinationDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
    }

}
