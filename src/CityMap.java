import java.util.Random;

public class CityMap extends Map {
    private static final iTile[] TILES = {new RoadTile(), new ForestTile(), new BuildingTile()};
    private Random random;

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected iTile createTile() {
        random = new Random();
        int index = random.nextInt(TILES.length);
        return TILES[index];
    }
}