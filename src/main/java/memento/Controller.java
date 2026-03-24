package memento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> redoHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            // Save current state to redo history
            redoHistory.add(model.createMemento());

            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (redoHistory.isEmpty()) {
            System.out.println("No memento found in redo history");
            return;
        }
        // Save current state to history
        history.add(model.createMemento());

        IMemento nextState = redoHistory.remove(redoHistory.size() - 1);
        model.restoreState(nextState);
        gui.updateGui();
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
        redoHistory.clear();
        gui.updateHistoryWindow();
    }

    public List<IMemento> getHistory() {
        return history;
    }

    public void restoreFromHistory(IMemento memento) {
        model.restoreState(memento);
        gui.updateGui();
    }
}