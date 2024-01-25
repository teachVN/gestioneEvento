package it.epicode.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "passaporto")
public class Passaporto {

    @Id
    @GeneratedValue
    private int id;

    private String passaporto;
    private String cavoli;

    @ManyToMany(mappedBy = "passaporti")

    //@JoinColumn(name = "persona_fk")
    private List<Persona> persone = new ArrayList<>();

    public Passaporto(int id, String passaporto, String cavoli, List<Persona> persone) {
        this.id = id;
        this.passaporto = passaporto;
        this.cavoli = cavoli;
        this.persone = persone;
    }

    public Passaporto() {
    }

    public Passaporto(String passaporto) {

        this.passaporto = passaporto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCavoli() {
        return cavoli;
    }

    public void setCavoli(String cavoli) {
        this.cavoli = cavoli;
    }

    public List<Persona> getPersona() {
        return persone;
    }

    public void setPersona(List<Persona> persone) {
        this.persone = persone;
    }

    public String getPassaporto() {
        return passaporto;
    }

    public void setPassaporto(String passaporto) {
        this.passaporto = passaporto;
    }

    @Override
    public String toString() {
        return "Passaporto{" +
                "id=" + id +
                ", passaporto='" + passaporto + '\'' +
                ", cavoli='" + cavoli + '\'' +
                '}';
    }
}
