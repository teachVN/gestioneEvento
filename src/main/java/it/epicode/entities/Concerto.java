package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "concerto")
@NamedQuery(name = "getConcertiInStreaming", query = "select c from Concerto c where c.inStreaming=:tipo")
@NamedQuery(name = "getConcertiPerGenere", query = "select c from Concerto c where c.genere=:genere")
public class Concerto extends Evento{
    @Enumerated(EnumType.STRING)
    private Genere genere;
    @Column(name = "in_streaming")
    private boolean inStreaming;

    public Concerto() {
    }

    public Concerto(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Genere genere, boolean inStreaming) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
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
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
                '}';
    }
}
