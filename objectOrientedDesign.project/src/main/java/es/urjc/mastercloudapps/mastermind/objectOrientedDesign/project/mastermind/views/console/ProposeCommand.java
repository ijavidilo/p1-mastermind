package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Error;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.MessageView;

import java.util.List;

public class ProposeCommand extends Command {

    ProposeCommand(PlayController playController) {
        super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView(this.playController).read();
            error = this.playController.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        new GameView(this.playController);
    }

    @Override
    protected boolean isActive() {
        return true;
    }

}
