package it.epicode.dao;


import it.epicode.entities.*;
import jakarta.persistence.*;

import java.util.List;

public class EventoDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDao(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }

    public void save(Evento e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();
    }

    public Evento getById(int id){
        return em.find(Evento.class, id);
    }

    public void delete(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();

        Evento e = getById(id);
        em.remove(e);
        et.commit();
    }

    public void close(){
        em.close();
        emf.close();
    }
//
    public List<Concerto> getConcertiInStreaming(boolean tipo){
        Query q = em.createNamedQuery("getConcertiInStreaming");
        q.setParameter("tipo",tipo);

        return q.getResultList();
    }
//
    public List<Concerto> getConcertiPerGenere(Genere genere){
        Query q = em.createNamedQuery("getConcertiPerGenere");
        q.setParameter("genere",genere);

        return q.getResultList();
    }
//
    public List<PartitaDiCalcio> getPartiteVinteInCasa(){
        Query q = em.createNamedQuery("getPartiteVinteInCasa");

        return q.getResultList();
    }
//
    public List<PartitaDiCalcio> getPartiteVinteInTrasferta(){
        Query q = em.createNamedQuery("getPartiteVinteInTrasferta");

        return q.getResultList();
    }

    public List<PartitaDiCalcio> getPartitePareggiate(){
        Query q = em.createNamedQuery("getPartitePareggiate");

        return q.getResultList();
    }

    public  List<GaraDiAtletica> getGareDiAtleticaPerVincitore(Persona vincitore){
        Query q = em.createNamedQuery("getGareDiAtleticaPerVincitore");
        q.setParameter("vincitore", vincitore);
        return q.getResultList();
    }

    public List<GaraDiAtletica> getGareDiAtleticaPerPartecipante(Persona partecipante){
        Query q = em.createNamedQuery("getGareDiAtleticaPerPartecipante");
        q.setParameter("partecipante", partecipante);
        return q.getResultList();
    }

    public List<Evento> getEventiSoldOut(){
        Query q = em.createNamedQuery("getEventiSoldOut");
        return q.getResultList();
    }


}
