package Composite.classes;

import java.util.ArrayList;

public class Birou extends AngajatAbstract{
    ArrayList<AngajatAbstract> angajati = new ArrayList<>();

    public Birou(String nume) {
        super(nume);
    }

    @Override
    public void aSosit() {
        for (AngajatAbstract a : angajati) {
            a.aSosit();
        }
    }

    @Override
    public void aPlecat() {
        for (AngajatAbstract a : angajati) {
            a.aPlecat();
        }
    }

    @Override
    public void adaugaAngajat(AngajatAbstract angajatAbstract) {
            angajati.add(angajatAbstract);
    }

    @Override
    public void stergeAngajat(int index) {
        if(index >= 0 && index < angajati.size()) {
            System.out.println(angajati.get(index).getNume() + " a fost sters");
            angajati.remove(index);
        }
    }

    @Override
    public AngajatAbstract getAngajat(String nume) {
        AngajatAbstract ref = null;
        for (AngajatAbstract a : angajati) {
            if(a.getNume().equals(nume)) {
                ref = a;
            }
        }
        return ref;
    }
}
