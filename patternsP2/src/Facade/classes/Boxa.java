package Facade.classes;

public class Boxa {
    String numeMelodie, genMelodie;
    int durataMelodie, volum;
    boolean estePornita;

    public void setNumeMelodie(String numeMelodie) {
        this.numeMelodie = numeMelodie;
    }

    public void setGenMelodie(String genMelodie) {
        this.genMelodie = genMelodie;
    }

    public void setDurataMelodie(int durataMelodie) {
        this.durataMelodie = durataMelodie;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public String getNumeMelodie() {
        return numeMelodie;
    }

    public String getGenMelodie() {
        return genMelodie;
    }

    public int getDurataMelodie() {
        return durataMelodie;
    }

    public int getVolum() {
        return volum;
    }

    public boolean isEstePornita() {
        return estePornita;
    }

    public void pornesteBoxa(){
        estePornita = true;
    }

    public void opresteBoxa(){
        estePornita = false;
    }
}
