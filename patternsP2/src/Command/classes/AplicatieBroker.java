package Command.classes;

import java.util.ArrayList;
import java.util.List;

public class AplicatieBroker {
    List<Ordin> ordine = new ArrayList<>();

    public void adaugaOrdin(Ordin ordin) {
        ordine.add(ordin);
    }

    public void trimitereOrdinSpreExecutie(){
        for(Ordin ordin : ordine){
            ordin.executaOrdin(ordin.nrActiuni);
        }
    }
}
