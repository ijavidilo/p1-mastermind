package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;

import java.util.List;

public class Session {

    private Game game;
    private State state;
    private GameRegistry registry;

    public Session() {
        this.game = new Game();
        this.state = new State();
        this.registry = new GameRegistry(this.game);
    }

    public void isNewGame() {
        this.game.clear();
        this.state.reset();
        this.registry.reset();
    }

    public void addProposedCombination(List<Color> colors) {
        this.game.addProposedCombination(colors);
        this.registry.registry();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.game.getColors(position);
    }

    public int getBlacks(int position) {
        return this.game.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.game.getWhites(position);
    }

    public int getWidth() {
        return this.game.getWidth();
    }

    public void next() {
        this.state.next();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public boolean undoable() {
        return this.registry.undoable();
    }

    public void undo() {
        this.registry.undo(this.game);
    }

    public boolean redoable() {
        return this.registry.redoable();
    }

    public void redo() {
        this.registry.redo(this.game);
    }

}