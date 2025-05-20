package Adapter.classes;

public class AdapterObiecte implements RadioAbstract{
    BoxaWireless boxaWireless;

    public AdapterObiecte(BoxaWireless boxaWireless) {
        this.boxaWireless = boxaWireless;
    }

    @Override
    public void conecteazaJack() {
        System.out.println("Prin adapter obiecte");
        boxaWireless.pornesteBluetooth();
    }
}
