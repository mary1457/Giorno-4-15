package mariapiabaldoin.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Concerto extends Evento {

    @Enumerated(EnumType.STRING)
    private Genere genere;
    private boolean inStreaming;


    public Concerto() {

    }


    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                    Genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto" +
                " titolo=" + getTitolo() +
                ", dataEvento=" + getDataEvento() +
                ", descrizione=" + getDescrizione() +
                ", tipoEvento=" + getTipoEvento() +
                ", numeroMassimoPartecipanti=" + getNumeroMassimoPartecipanti() +
                ", genere=" + genere +
                ", inStreaming=" + inStreaming;
    }
}