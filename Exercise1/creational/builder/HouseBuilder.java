package creational.builder;

public class HouseBuilder {
    private String walls;
    private String roof;
    private String windows;

    public HouseBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder setWindows(String windows) {
        this.windows = windows;
        return this;
    }

    public House build() {
        return new House(walls, roof, windows);
    }
}
