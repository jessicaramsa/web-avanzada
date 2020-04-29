package Persistencia;

import Bean.Cliente;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author jessicaramsa
 */
@Stateless
public class Agenda {
    private ArrayList<Cliente> agenda;

    public Agenda() {
        agenda = new ArrayList<>();
        Cliente c1 = new Cliente(1, "Patricia Tavares", "Del Dinar #151",
                "Delta de Jerez", "TARP940726", "7611199", "pmctr1994@hotmail.com");
        Cliente c2 = new Cliente(2, "Gerardo Rodriguez", "Topografos #103",
                "Panorama", "ROBG940726", "1106598", "g@hotmail.com");
        Cliente c3 = new Cliente(3, "Juan Lopez", "De la Rupia #178",
                "Delta de Jerez", "JURP978962", "2194758", "tavarami@hotmail.com");
        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);
    }

    public ArrayList<Cliente> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Cliente> agenda) {
        this.agenda = agenda;
    }
}
