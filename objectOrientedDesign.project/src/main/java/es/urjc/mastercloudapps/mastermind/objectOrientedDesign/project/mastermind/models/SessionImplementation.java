package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;

import java.util.List;

public class SessionImplementation implements Session {

    private Game game;
    private State state;
    private GameRegistry gameRegistry;

    public SessionImplementation() {
        this.game = new Game();
        this.state = new State();
        this.gameRegistry = new GameRegistry(this.game);
    }

    public void isNewGame() {
        this.game.clear();
        this.state.reset();
        this.gameRegistry.reset();
    }

    public void addProposedCombination(List<Color> colors) {
        this.game.addProposedCombination(colors);
        this.gameRegistry.registry();
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

    public void next() {
        this.state.next();
    }

    public boolean undoable() {
        return this.gameRegistry.undoable();
    }

    public void undo() {
        this.gameRegistry.undo(this.game);
    }

    public boolean redoable() {
        return this.gameRegistry.redoable();
    }

    public void redo() {
        this.gameRegistry.redo(this.game);
    }

    @Override
    public int getWidth() {
        return this.game.getWidth();
    }

    @Override
    public StateValue getValueState() {
        return this.state.getValueState();
    }
}