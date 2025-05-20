package Composite.classes;

public abstract class AngajatAbstract {
    protected String nume;

    public AngajatAbstract(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    // metode specifice nodurilor frunza si composite
    public abstract void aSosit();
    public abstract void aPlecat();

    // metode specifice nodurilor composite
    public abstract void adaugaAngajat(AngajatAbstract angajatAbstract);
    public abstract void stergeAngajat(int index);
    public abstract AngajatAbstract getAngajat(String nume);
}
