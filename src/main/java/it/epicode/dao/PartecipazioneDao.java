package it.epicode.dao;

import it.epicode.entities.Evento;
import it.epicode.entities.Partecipazione;
import jakarta.persistence.*;

import java.util.List;

public class PartecipazioneDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PartecipazioneDao(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }

    public void save(Partecipazione p){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(p);

        et.commit();
    }

    public Partecipazione getById(int id){
        return em.find(Partecipazione.class, id);
    }

    public void delete(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();

        Partecipazione p = getById(id);
        em.remove(p);
        et.commit();
    }

    public void close(){
        em.close();
        emf.close();
    }

    public List<Partecipazione> getPartecipazioniDaConfermarePerEvento(Evento e){
        Query q = em.createNamedQuery("getPartecipazioniDaConfermarePerEvento");
        q.setParameter("evento", e);
        return q.getResultList();
    }
}
