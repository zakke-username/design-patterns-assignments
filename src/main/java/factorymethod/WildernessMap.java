package factorymethod;

import java.util.Random;

public class WildernessMap extends Map {

    public Tile createTile() {
        // Swamp, water or forest
        Random rand = new Random();
        int type = rand.nextInt(3);
        return switch (type) {
            case 0 -> new SwampTile();
            case 1 -> new WaterTile();
            case 2 -> new ForestTile();
            default -> null;
        };
    }
}
