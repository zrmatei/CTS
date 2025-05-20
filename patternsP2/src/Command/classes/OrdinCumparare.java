package Command.classes;

public class OrdinCumparare extends Ordin{
    Broker broker;

    public OrdinCumparare(int nrActiuni, Broker broker) {
        super(nrActiuni);
        this.broker = broker;
    }

    @Override
    public void executaOrdin(int nrActiuni) {
        broker.executaOrdin(nrActiuni);
    }
}
