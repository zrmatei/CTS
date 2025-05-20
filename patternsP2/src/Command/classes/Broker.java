package Command.classes;

public class Broker {
    public void executaOrdin(int nrActiuni){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Ordin executat");
    }
}
