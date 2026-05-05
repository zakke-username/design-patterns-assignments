package command;

public class GenerateCodeCommand implements Command {

    private Grid grid;

    public GenerateCodeCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        printGrid();
    }

    private void printGrid() {
        int[][] g = grid.getGrid();
        int w = grid.getWidth();
        int h = grid.getHeight();

        System.out.println("int[][] pixelArt = {");
        for (int y = 0; y < h; y++) {
            System.out.print("    {");
            for (int x = 0; x < w; x++) {
                System.out.print(g[y][x]);
                if (x < w - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (y < h - 1) {
                System.out.println(", ");
            } else {
                System.out.println();
            }
        }
        System.out.println("};");
    }
}
