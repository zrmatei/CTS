package Prototype;

public abstract class Plane implements Cloneable{
    String nume;
    float pret;
    int viteza;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public Object clone() throws CloneNotSupportedException {
        Plane clone = (Plane) super.clone();
        clone.nume = nume;
        clone.pret = pret;
        clone.viteza = viteza;

        return clone;
    }
}
