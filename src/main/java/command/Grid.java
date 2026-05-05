package command;

public class Grid {

    private final int width = 8;
    private final int height = 8;
    private final int[][] grid = new int[width][height];
    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void up() {
        if (y > 0) {
            y--;
        }
    }

    public void down() {
        if (y < height - 1) {
            y++;
        }
    }

    public void left() {
        if (x > 0) {
            x--;
        }
    }

    public void right() {
        if (x < width - 1) {
            x++;
        }
    }

    public void toggle() {
        grid[y][x] = (grid[y][x] == 0) ? 1 : 0;
    }
}
