package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Color;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

import java.util.ArrayList;
import java.util.List;

public class View extends WithConsoleView {

    private int attempts;

    private int width;

    private List<List<Color>> allColors;

    private List<List<Integer>> allResults;

    public View() {
        this.allColors = new ArrayList<List<Color>>();
        this.allResults = new ArrayList<List<Integer>>();
    }

    public void writeGame() {
        this.console.writeln();
        new AttemptsView().writeln(this.attempts);
        new SecretCombinationView().writeln(this.width);
        for (int i = 0; i < this.allColors.size(); i++) {
            new ProposedCombinationView().write(this.allColors.get(i));
            new ResultView().writeln(this.allResults.get(i));
        }
    }

    public void writeLooser() {
        MessageView.LOOSER.writeln();
    }

    public void writeWinner() {
        MessageView.WINNER.writeln();
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void clearAllColors() {
        this.allColors.clear();
    }

    public void clearAllResults() {
        this.allResults.clear();
    }

    public void setAllColors(List<Color> colors) {
        this.allColors.add(colors);
    }

    public void setAllResults(int blacks, int whites) {
        List<Integer> results = new ArrayList<Integer>();
        results.add(blacks);
        results.add(whites);
        this.allResults.add(results);
    }

}
