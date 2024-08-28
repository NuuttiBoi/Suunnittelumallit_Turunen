public class Game {
    private int mapWidth = 5;
    private int mapLength = 5;
    private double mapDecider = 0.5;
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Hello and welcome!");
        game.createMap();
    }
    void createMap(){
        double randomNumber = Math.random();
        Map map;
        if(randomNumber < mapDecider ){
            map = new CityMap(mapWidth, mapLength);
            System.out.println("You got a city map");
        } else {
            map = new WildernessMap(mapWidth, mapLength);
            System.out.println("You got a wilderness map");
        }
        map.display();
    }
}
