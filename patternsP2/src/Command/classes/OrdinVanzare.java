package Command.classes;

public class OrdinVanzare extends Ordin{
    Broker broker;

    public OrdinVanzare(int nrActiuni, Broker broker) {
        super(nrActiuni);
        this.broker = broker;
    }

    @Override
    public void executaOrdin(int nrActiuni) {
        broker.executaOrdin(nrActiuni);
    }
}
