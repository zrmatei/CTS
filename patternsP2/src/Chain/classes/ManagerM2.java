package Chain.classes;

public class ManagerM2 extends AprobatorBuget{
    public static final int SUMA_MAXIMA = 5000;

    @Override
    public void aprobaCerere(int suma) {
        if(suma < SUMA_MAXIMA){
            System.out.println("Cerere aprobata de M2");
        }else{
            if(aprobatorBuget != null){
                aprobatorBuget.aprobaCerere(suma);
            }else{
                System.out.println("Cerere respinsa");
            }
        }
    }
}
