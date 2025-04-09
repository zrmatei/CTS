package Builder.main;

import Builder.classes.Plane;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder("K40", 1000).adaugaPret(500000).build();
    }
}
