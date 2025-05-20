package Command.main;

import Command.classes.AplicatieBroker;
import Command.classes.Broker;
import Command.classes.OrdinCumparare;

// Folosit cand vreau sa lucrez asincron, fara sa depind de alte lucruri
// , fiecare actiune este un obiect
public class Main {
    public static void main(String[] args) {
        AplicatieBroker appBroker1 = new AplicatieBroker();
        Broker broker = new Broker();
        appBroker1.adaugaOrdin(new OrdinCumparare(5, broker));
        System.out.println("Salut");
        appBroker1.adaugaOrdin(new OrdinCumparare(4, broker));
        appBroker1.adaugaOrdin(new OrdinCumparare(10, broker));
        System.out.println("Pa");
        appBroker1.trimitereOrdinSpreExecutie();
    }
}
