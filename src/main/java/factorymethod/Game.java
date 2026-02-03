package factorymethod;

public class Game {
    static void main() {
        Map m = createMap(MapType.WILDERNESS);
        m.display();
    }

    // todo: add enum map type
    public static Map createMap(MapType type) {
        return switch (type) {
            case CITY -> new CityMap();
            case WILDERNESS -> new WildernessMap();
            default -> throw new IllegalArgumentException();
        };
    }
}
