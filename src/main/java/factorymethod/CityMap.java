package factorymethod;

import java.util.Random;

public class CityMap extends Map {
    public Tile createTile() {
        // Road, forest or building
        Random rand = new Random();
        int type =  rand.nextInt(3);
        return switch (type) {
            case 0 -> new RoadTile();
            case 1 -> new ForestTile();
            case 2 -> new BuildingTile();
            default -> null;
        };
    }
}
