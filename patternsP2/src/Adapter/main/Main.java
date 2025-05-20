package Adapter.main;

import Adapter.classes.AdapterClase;
import Adapter.classes.AdapterObiecte;
import Adapter.classes.BoxaWireless;

/*  ESTE FOLOSIT ATUNCI CAND AM O INTERFATA VECHE SI VREAU SA MAI ADAUG ALTA CE NU ARE LEGAUTRA CU PRIMA, DAR
*   VREAU SA LE COMBIN, PRACTIC CONVERSIE  */
public class Main {
    public static void main(String[] args) {
        AdapterObiecte adapterObiecte = new AdapterObiecte(new BoxaWireless());
        adapterObiecte.conecteazaJack();

        AdapterClase adapterClase = new AdapterClase();
        adapterClase.conecteazaJack();
    }
}
