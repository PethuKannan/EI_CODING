package creational.builder;

public class House {
    private String walls;
    private String roof;
    private String windows;

    public House(String walls, String roof, String windows) {
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
    }

    public void show() {
        System.out.println("House built with " + walls + ", " + roof + ", " + windows);
    }
}
