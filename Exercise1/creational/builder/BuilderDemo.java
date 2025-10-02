package creational.builder;

public class BuilderDemo {
    public static void run() {
        House house = new HouseBuilder()
                .setWalls("Brick Walls")
                .setRoof("Tiled Roof")
                .setWindows("Glass Windows")
                .build();
        house.show();
    }
}
