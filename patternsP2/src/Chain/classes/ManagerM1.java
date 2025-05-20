package Chain.classes;

public class ManagerM1 extends AprobatorBuget{
    public static final int SUMA_MAXIMA = 100;

    @Override
    public void aprobaCerere(int suma) {
        if(suma < SUMA_MAXIMA){
            System.out.println("Cerere aprobata de M1");
        }else{
            if(aprobatorBuget != null){
                aprobatorBuget.aprobaCerere(suma);
            }else{
                System.out.println("Cerere respinsa");
            }
        }
    }
}
