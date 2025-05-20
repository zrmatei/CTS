package Composite.main;

import Composite.classes.Angajat;
import Composite.classes.Birou;

// Folosit cand am o ierarhie/un arbore
public class Main {
    public static void main(String[] args) {
        Birou birou1 = new Birou("HR");
        Angajat angajat1 = new Angajat("Dorel");
        Angajat angajat2 = new Angajat("Mircea");

        Birou birou2 = new Birou("IT");
        Angajat angajat3 = new Angajat("Florinel");
        Angajat angajat4 = new Angajat("Gugu");

        birou1.adaugaAngajat(angajat1);
        birou1.adaugaAngajat(angajat2);
        birou2.adaugaAngajat(angajat3);
        birou2.adaugaAngajat(angajat4);

        birou1.aSosit();
        birou2.aPlecat();

    }
}
