package Builder.classes;

/* PENTRU BUILDER: AM NEVOIE DE O CLASA INTERNA CE ARE CONSTRUCTOR CU ANUMITI PARAMETRII,
RESTUL II ADAUG DUPA PRIN METODE (ex: adaugaPret)
LA FINAL TREBUIE SA CREEZ O METODA DE BUILD CE PRIMESTE OBIECTUL MEU (ex: Plane)
 */

public class Plane {
    String nume;
    double pret;
    int viteza;

    public Plane(String nume, double pret, int viteza) {
        this.nume = nume;
        this.pret = pret;
        this.viteza = viteza;
    }

    public Plane() {
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public int getViteza() {
        return viteza;
    }

    public static class PlaneBuilder {
        Plane plane = null;


        public PlaneBuilder(String nume, int viteza) {
            this.plane = new Plane();
            this.plane.nume = nume;
            this.plane.viteza = viteza;
        }

        public PlaneBuilder adaugaPret(double pret){
            this.plane.pret = pret;
            return this;
        }

        public Plane build(){
            return this.plane;
        }
    }
}
