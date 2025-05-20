package Facade.classes;

public class Alexa {
    Boxa boxa;
    Camera camera;
    Jaluzele jaluzele;

    public Alexa(Boxa boxa, Camera camera, Jaluzele jaluzele) {
        this.boxa = boxa;
        this.camera = camera;
        this.jaluzele = jaluzele;
    }

    public void avemMusafiri(){
        boxa.pornesteBoxa();
        boxa.setDurataMelodie(3);
        boxa.setGenMelodie("Pop");
        boxa.setVolum(50);
        boxa.setNumeMelodie("Melodie pe 2 voci");
        jaluzele.deschideJaluzele();
        camera.deschideCamera();
        System.out.println("Avem invitati");
    }

    public void singur(){
        boxa.opresteBoxa();
        jaluzele.inchideJaluzele();
        camera.inchideCamera();
        System.out.println("Sunt singur in casa");
    }
}
