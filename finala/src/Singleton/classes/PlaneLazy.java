package Singleton.classes;

public class PlaneLazy {
    String nume;
    float pret;
    int viteza;
    private static PlaneLazy instance = null;

    private PlaneLazy() {
        this.nume = "Test";
        this.pret = 50000;
        this.viteza = 1000;
    }

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

    public static PlaneLazy getInstance() {
        if(instance == null){
            instance = new PlaneLazy();
        }
        return instance;
    }

}
