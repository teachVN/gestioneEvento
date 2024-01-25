package it.epicode.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "partita_di_calcio")
@NamedQuery(name = "getPartiteVinteInCasa", query = "select p from PartitaDiCalcio p where p.goalCasa>p.goalOspite")
@NamedQuery(name = "getPartiteVinteInTrasferta", query = "select p from PartitaDiCalcio p where p.goalOspite>p.goalCasa")
@NamedQuery(name = "getPartitePareggiate", query = "select p from PartitaDiCalcio p where p.goalOspite=p.goalCasa")
public class PartitaDiCalcio extends Evento{

    private String casa;
    private String ospite;
    private String vincitore;

    @Column(name = "goal_casa")
    private int goalCasa;
    @Column(name = "goal_ospite")
    private int goalOspite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, String casa, String ospite, String vincitore, int goalCasa, int goalOspite) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.casa = casa;
        this.ospite = ospite;
        this.vincitore = vincitore;
        this.goalCasa = goalCasa;
        this.goalOspite = goalOspite;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getOspite() {
        return ospite;
    }

    public void setOspite(String ospite) {
        this.ospite = ospite;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    public int getGoalCasa() {
        return goalCasa;
    }

    public void setGoalCasa(int goalCasa) {
        this.goalCasa = goalCasa;
    }

    public int getGoalOspite() {
        return goalOspite;
    }

    public void setGoalOspite(int goalOspite) {
        this.goalOspite = goalOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "casa='" + casa + '\'' +
                ", ospite='" + ospite + '\'' +
                ", vincitore='" + vincitore + '\'' +
                ", goalCasa=" + goalCasa +
                ", goalOspite=" + goalOspite +
                '}';
    }
}
