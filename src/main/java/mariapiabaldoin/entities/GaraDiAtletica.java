package mariapiabaldoin.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class GaraDiAtletica extends Evento {


    private String vincitore;


    public GaraDiAtletica() {

    }


    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, String vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);

        this.vincitore = vincitore;
    }


    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica" +
                " titolo=" + getTitolo() +
                ", dataEvento=" + getDataEvento() +
                ", descrizione=" + getDescrizione() +
                ", tipoEvento=" + getTipoEvento() +
                ", numeroMassimoPartecipanti=" + getNumeroMassimoPartecipanti() +
                ", vincitore=" + vincitore;
    }
}
