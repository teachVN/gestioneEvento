package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;

    private String cognome;

    private String email;

    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @OrderBy("evento asc")
    private List<Partecipazione> partecipazioni;

    @ManyToMany
    @JoinTable(name = "persone_gare",
    joinColumns = @JoinColumn(name = "persona_fk"),
    inverseJoinColumns = @JoinColumn(name = "gara_fk"))
    private Set<GaraDiAtletica> gare;

    @OneToMany(mappedBy = "vincitore")
    private List<GaraDiAtletica> gareVinte;

    public Persona() {
    }

    public Persona(int id, String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso, List<Partecipazione> partecipazioni) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.partecipazioni = partecipazioni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<GaraDiAtletica> getGare() {
        return gare;
    }

    public void setGare(Set<GaraDiAtletica> gare) {
        this.gare = gare;
    }

    public List<GaraDiAtletica> getGareVinte() {
        return gareVinte;
    }

    public void setGareVinte(List<GaraDiAtletica> gareVinte) {
        this.gareVinte = gareVinte;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascita=" + dataNascita +
                ", sesso=" + sesso +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}
