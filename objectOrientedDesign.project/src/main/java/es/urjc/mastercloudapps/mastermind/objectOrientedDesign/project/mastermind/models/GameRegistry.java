package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

import java.util.ArrayList;

public class GameRegistry {

    private Game game;
    private ArrayList<GameMemento> mementoList;
    private int firstPrevious;

    public GameRegistry(Game game) {
        this.game = game;
        this.mementoList = new ArrayList<GameMemento>();
        this.mementoList.add(firstPrevious, this.game.createMemento());
        this.firstPrevious = 0;
    }

    public void registry() {
        for (int i = 0; i < this.firstPrevious; i++) {
            this.mementoList.remove(0);
        }
        this.firstPrevious = 0;
        this.mementoList.add(this.firstPrevious, this.game.createMemento());
    }

    public void undo(Game game) {
        this.firstPrevious++;
        game.loadMemento(this.mementoList.get(this.firstPrevious));
    }

    public void redo(Game game) {
        this.firstPrevious--;
        game.loadMemento(this.mementoList.get(this.firstPrevious));
    }

    public boolean undoable() {
        return this.firstPrevious < this.mementoList.size() - 1;
    }

    public boolean redoable() {
        return this.firstPrevious >= 1;
    }

    public void reset() {
        this.mementoList = new ArrayList<GameMemento>();
        this.mementoList.add(firstPrevious, this.game.createMemento());
        this.firstPrevious = 0;
    }

}
