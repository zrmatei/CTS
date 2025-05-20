package Chain.classes;

public abstract class AprobatorBuget {
     AprobatorBuget aprobatorBuget;

    public void setAprobatorBuget(AprobatorBuget aprobatorBuget) {
        this.aprobatorBuget = aprobatorBuget;
    }

    public abstract void aprobaCerere(int suma);
}
