package command;

public class MoveCursorDownCommand implements Command {

    private Grid grid;

    public MoveCursorDownCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.down();
    }
}
