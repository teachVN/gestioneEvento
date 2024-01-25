package it.epicode;

import it.epicode.dao.EventoDAO;
import it.epicode.dao.LocationDao;
import it.epicode.dao.PartecipazioneDao;
import it.epicode.dao.PersonaDao;
import it.epicode.entities.Evento;
import it.epicode.entities.Location;
import it.epicode.entities.Partecipazione;
import it.epicode.entities.Persona;

public class UsaGestioneEvento {

    public static void main(String[] args) {
        EventoDAO eventoDao = new EventoDAO();
        LocationDao locationDao = new LocationDao();
        PersonaDao personaDao = new PersonaDao();
        PartecipazioneDao partecipazioneDao = new PartecipazioneDao();

//        Persona p1 = new Persona();
//        p1.setNome("Carlo");
//        p1.setCognome("Re");

//        Persona p2 = personaDao.getById(2);
//
//        //Persona p2 = new Persona();
//        p2.setNome("Carlo");
//        p2.setCognome("Re");

     //   personaDao.save(p2);
//        personaDao.save(p2);
//
//        Location location = new Location();
//        location.setCitta("Roma");
//
//        locationDao.save(location);
//

//
//        Evento ev2 = new Evento();
//        ev2.setDescrizione("corsa");
//        ev2.setLocation(location);
//
//        eventoDao.save(ev1);
//        eventoDao.save(ev2);
//
//        Partecipazione pa1 = new Partecipazione();
//        pa1.setPersona(p1);
//        pa1.setEvento(ev1);
//
//        Partecipazione pa2 = new Partecipazione();
//        pa2.setPersona(p1);
//        pa2.setEvento(ev2);
//
//        Partecipazione pa3 = new Partecipazione();
//        pa3.setPersona(p2);
//        pa3.setEvento(ev2);
//
//        partecipazioneDao.save(pa1);
//        partecipazioneDao.save(pa2);
//        partecipazioneDao.save(pa3);

        //Evento e = eventoDao.getById(1);

        //eventoDao.delete(e);

        Evento ev1 = new Evento();
        ev1.setDescrizione("concerto");
        ev1.setLocation(locationDao.getById(1));
        eventoDao.save(ev1);

        Persona p = personaDao.getById(1);

        Evento ev2 = new Evento();
        ev2.setDescrizione("concerto");
        ev2.setLocation(locationDao.getById(1));
        eventoDao.save(ev2);

        Persona p2 = personaDao.getById(1);


        Partecipazione pa1 = new Partecipazione();
        pa1.setPersona(p);
        pa1.setEvento(ev1);

        Partecipazione pa2 = new Partecipazione();
        pa2.setPersona(p2);
        pa2.setEvento(ev2);

        partecipazioneDao.save(pa1);
        partecipazioneDao.save(pa2);


        Persona persona = personaDao.getById(1);

        persona.getPartecipazioni().stream().forEach(partecipazione -> System.out.println(partecipazione));

    }
}
