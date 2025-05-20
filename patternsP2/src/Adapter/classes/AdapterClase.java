package Adapter.classes;

public class AdapterClase extends BoxaWireless implements RadioAbstract{
    @Override
    public void conecteazaJack() {
        super.pornesteBluetooth();
    }
}
