import java.util.Random;

public class WildernessMap extends Map {
    private static final iTile[] TILES = {new SwampTile(), new WaterTile(), new ForestTile()};
    private Random random;

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected iTile createTile() {
        random=new Random();
        int index = random.nextInt(TILES.length);
        return TILES[index];
    }
}