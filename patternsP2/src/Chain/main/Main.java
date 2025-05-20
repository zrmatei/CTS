package Chain.main;

import Chain.classes.AprobatorBuget;
import Chain.classes.ManagerM1;
import Chain.classes.ManagerM2;
import Chain.classes.Sef;

// Folosit atunci cand am o serie de pasi bine definiti;
// un lant (practic, daca primul nu poate procesa cererea, ma duc la urmatorul, si tot asa)
public class Main {
    public static void main(String[] args) {
        ManagerM1 m1 = new ManagerM1();
        ManagerM2 m2 = new ManagerM2();
        Sef sef = new Sef();

        m1.setAprobatorBuget(m2);
        m2.setAprobatorBuget(sef);

        m1.aprobaCerere(1000);
        m2.aprobaCerere(200);
        sef.aprobaCerere(10000);

    }
}
