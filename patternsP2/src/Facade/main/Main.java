package Facade.main;

import Facade.classes.Alexa;
import Facade.classes.Boxa;
import Facade.classes.Camera;
import Facade.classes.Jaluzele;

// FOLOSIT ATUNCI CAND VREAU SA ASCUND COMPLEXITATEA PASILOR
public class Main {
    public static void main(String[] args) {
        Alexa alexa = new Alexa(new Boxa(), new Camera(), new Jaluzele());

        alexa.avemMusafiri();
        alexa.singur();
    }
}
