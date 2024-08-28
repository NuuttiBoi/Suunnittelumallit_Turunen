import java.util.Random;

public abstract class Map {
    protected int width;
    protected int height;
    protected iTile[][] mapGrid;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.mapGrid = new iTile[height][width];
        generateMap();
    }

    protected abstract iTile createTile();

    private void generateMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mapGrid[i][j] = createTile();
            }
        }
    }

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(mapGrid[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
