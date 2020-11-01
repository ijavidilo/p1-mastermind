package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

import java.util.List;

public class ResultView extends WithConsoleView {

    public void writeln(List<Integer> results) {
        MessageView.RESULT.writeln(results.get(0), results.get(1));
    }

}
