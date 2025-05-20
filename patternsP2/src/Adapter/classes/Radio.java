package Adapter.classes;

public class Radio implements RadioAbstract{
    @Override
    public void conecteazaJack() {
        System.out.println("Am conectat firul");
    }
}
