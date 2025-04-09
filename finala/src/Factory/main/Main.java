package Factory.main;

import Factory.classes.FactoryPlane;
import Factory.classes.HuntFactory;
import Factory.classes.Plane;
import Factory.classes.SmallFactory;

public class Main {
    public static void main(String[] args) {
        FactoryPlane factoryPlane = new SmallFactory();
        Plane plane = factoryPlane.createPlane();
        plane.detalii();

        FactoryPlane factoryPlane2 = new HuntFactory();
        Plane plane2 = factoryPlane2.createPlane();
        plane2.detalii();
    }
}
