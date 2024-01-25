package it.epicode.dao;

import it.epicode.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class LocationDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public LocationDao(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }

    public void save(Location p){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(p);

        et.commit();
    }

    public Location getById(int id){
        return em.find(Location.class, id);
    }

    public void delete(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();

        Location p = getById(id);
        em.remove(p);
        et.commit();
    }

    public void close(){
        em.close();
        emf.close();
    }
}
