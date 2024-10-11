package mariapiabaldoin.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Evento {

    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int goalSquadraDiCasa;
    private int goalSquadraOspite;


    public PartitaDiCalcio() {

    }


    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, String squadraDiCasa, String squadraOspite, int goalSquadraDiCasa, int goalSquadraOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.goalSquadraDiCasa = 0;
        this.goalSquadraOspite = 0;
        this.squadraVincente = null;
    }


    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGoalSquadraDiCasa() {
        return goalSquadraDiCasa;
    }

    public void setGoalSquadraDiCasa(int goalSquadraDiCasa) {
        this.goalSquadraDiCasa = goalSquadraDiCasa;
    }

    public int getGoalSquadraOspite() {
        return goalSquadraOspite;
    }

    public void setGoalSquadraOspite(int goalSquadraOspite) {
        this.goalSquadraOspite = goalSquadraOspite;
    }

    private void aggiornaSquadraVincente() {
        if (goalSquadraDiCasa > goalSquadraOspite) {
            squadraVincente = squadraDiCasa;
        } else if (goalSquadraDiCasa < goalSquadraOspite) {
            squadraVincente = squadraOspite;
        } else {
            squadraVincente = "Pareggio";
        }
    }


    @Override
    public String toString() {
        return "PartitaDiCalcio" +
                " titolo=" + getTitolo() +
                ", dataEvento=" + getDataEvento() +
                ", descrizione=" + getDescrizione() +
                ", tipoEvento=" + getTipoEvento() +
                ", numeroMassimoPartecipanti=" + getNumeroMassimoPartecipanti() +
                ", squadraDiCasa=" + squadraDiCasa +
                ", squadraOspite=" + squadraOspite +
                ", goalSquadraDiCasa=" + goalSquadraDiCasa +
                ", goalSquadraOspite=" + goalSquadraOspite +
                ", squadraVincente=" + squadraVincente;
    }
}
