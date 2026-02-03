package factorymethod;

public abstract class Map {
    private int width = 16;
    private int height = 9;
    private Tile[][] tiles = new Tile[this.height][this.width];

    public Map() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                tiles[y][x] = createTile();
            }
        }
    }

    public void display() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                System.out.print(this.tiles[y][x].getCharacter());
            }
            System.out.println();
        }
    }

    public abstract Tile createTile();
}
