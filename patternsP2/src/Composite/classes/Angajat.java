package Composite.classes;

public class Angajat extends AngajatAbstract{
    public Angajat(String nume) {
        super(nume);
    }

    @Override
    public void aSosit() {
        System.out.println("A venit " + nume);
    }

    @Override
    public void aPlecat() {
        System.out.println("Plecat " + nume);
    }

    @Override
    public void adaugaAngajat(AngajatAbstract angajat) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeAngajat(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AngajatAbstract getAngajat(String nume) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getNume() {
        return super.getNume();
    }
}
