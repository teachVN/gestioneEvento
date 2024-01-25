package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "gara_di_atletica")
@NamedQuery(name = "getGareDiAtleticaPerVincitore", query = "select g from GaraDiAtletica g where g.vincitore=:vincitore")
@NamedQuery(name = "getGareDiAtleticaPerPartecipante", query = "select g from GaraDiAtletica g where :partecipante member of g.atleti")
public class GaraDiAtletica extends Evento{

    @ManyToMany(mappedBy = "gare")
    private Set<Persona> atleti;

    @ManyToOne
    @JoinColumn(name = "persona_fk")
    private Persona vincitore;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Set<Persona> atleti, Persona vincitore) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }


}
