package it.epicode;

import it.epicode.dao.EventoDAO;
import it.epicode.dao.EventoDao;
import it.epicode.dao.LocationDao;
import it.epicode.dao.PartecipazioneDao;
import it.epicode.dao.PersonaDao;
import it.epicode.entities.Concerto;
import it.epicode.entities.Genere;

import java.time.LocalDate;

public class UsaEventoDao {

    public static void main(String[] args) {
        LocationDao locationDao = new LocationDao();
        EventoDao eventoDao = new EventoDao();

        PersonaDao personaDao = new PersonaDao();
        PartecipazioneDao partecipazioneDao = new PartecipazioneDao();
/*
        Location location1 = new Location();
        Location location2 = new Location();
        location1.setCitta("Roma");
        location2.setCitta("Milano");

        Persona p = new Persona();
        p.setNome("Sara");
        p.setCognome("Conti");

        locationDao.save(location1);
        locationDao.save(location2);
        personaDao.save(p);

        Evento e1 = new Evento();
        e1.setDescrizione("manifestazione");
        e1.setDataEvento(LocalDate.of(2024,5,21));
        e1.setLocation(location1);

        eventoDao.save(e1);

        Evento e2 = new Evento();
        e2.setLocation(location2);
        e2.setDescrizione("corsa");
        e2.setDataEvento(LocalDate.of(2024,6,21));
        eventoDao.save(e2);

        Partecipazione pa1 = new Partecipazione();
        pa1.setEvento(e1);
        pa1.setPersona(p);

        Partecipazione pa2 = new Partecipazione();
        pa2.setEvento(e2);
        pa2.setPersona(p);

        partecipazioneDao.save(pa1);
        partecipazioneDao.save(pa2);

        PartitaDiCalcio partitaDiCalcio = new PartitaDiCalcio();

        partitaDiCalcio.setCasa("Napoli");
        partitaDiCalcio.setOspite("Roma");
        partitaDiCalcio.setGoalCasa(2);
        partitaDiCalcio.setGoalOspite(2);
        partitaDiCalcio.setLocation(location2);
        partitaDiCalcio.setDataEvento(LocalDate.of(2024,5,5));
//
        eventoDao.save(partitaDiCalcio);

        PartitaDiCalcio partitaDiCalcio2 = new PartitaDiCalcio();

        partitaDiCalcio2.setCasa("Milan");
        partitaDiCalcio2.setOspite("Roma");
        partitaDiCalcio2.setGoalCasa(1);
        partitaDiCalcio2.setGoalOspite(2);
        partitaDiCalcio2.setLocation(location2);
        partitaDiCalcio2.setDataEvento(LocalDate.of(2024,5,5));

        eventoDao.save(partitaDiCalcio2);

        PartitaDiCalcio partitaDiCalcio3 = new PartitaDiCalcio();

        partitaDiCalcio3.setCasa("Juve");
        partitaDiCalcio3.setOspite("Napoli");
        partitaDiCalcio3.setGoalCasa(3);
        partitaDiCalcio3.setGoalOspite(2);
        partitaDiCalcio3.setLocation(location2);
        partitaDiCalcio3.setDataEvento(LocalDate.of(2024,5,5));

        eventoDao.save(partitaDiCalcio3);

        PartitaDiCalcio partitaDiCalcio4 = new PartitaDiCalcio();

        partitaDiCalcio4.setCasa("Salernitana");
        partitaDiCalcio4.setOspite("Roma");
        partitaDiCalcio4.setGoalCasa(4);
        partitaDiCalcio4.setGoalOspite(2);
        partitaDiCalcio4.setLocation(location2);
        partitaDiCalcio4.setDataEvento(LocalDate.of(2024,5,5));

        eventoDao.save(partitaDiCalcio4);
//
*/

/* //creo una gara e la assegno a 2 persone
        GaraDiAtletica g1 = new GaraDiAtletica();
        //g1.setLocation(location2);
        g1.setDataEvento(LocalDate.of(2024,5,12));

        eventoDao.save(g1);


        Persona p1 = new Persona();
        p1.setNome("Michele");
        p1.getGare().add(g1);
        personaDao.save(p1);

        Persona p2 = new Persona();
        p2.setNome("Fabio");
        p2.getGare().add(g1);
        personaDao.save(p2);
        */

        //recupero la gara con id 102 e le assegno il vincitore con id 3 che recupero dal db
//        GaraDiAtletica gara = (GaraDiAtletica) eventoDao.getById(102);
//        gara.setVincitore(personaDao.getById(3));
//        eventoDao.save(gara);


        // creo un concerto
        Concerto concerto = new Concerto();
        concerto.setDataEvento(LocalDate.of(2024,8,3));
        concerto.setGenere(Genere.POP);
        concerto.setInStreaming(false);
        eventoDao.save(concerto);

        eventoDao.getConcertiInStreaming(true).stream().forEach(System.out::println);
        eventoDao.getConcertiPerGenere(Genere.POP).stream().forEach(System.out::println);


//        eventoDao.getPartitePareggiate().stream().forEach(System.out::println);
//        System.out.println();
//        eventoDao.getPartiteVinteInCasa().stream().forEach(System.out::println);
//        System.out.println();
//        eventoDao.getPartiteVinteInTrasferta().stream().forEach(System.out::println);
//        System.out.println();
//        eventoDao.getConcertiInStreaming(true).stream().forEach(System.out::println);
//        System.out.println();
//        eventoDao.getConcertiPerGenere(Genere.POP).stream().forEach(System.out::println);
//        System.out.println();
//
//        //eventoDao.getGareDiAtleticaPerVincitore(personaDao.getById(202)).stream().forEach(System.out::println);
//
//        eventoDao.getGareDiAtleticaPerPartecipante(personaDao.getById(303)).stream().forEach(System.out::println);


//        p=personaDao.getById(52);
//        e1=eventoDao.getById(152);
//        p.getPartecipazioni().forEach(System.out::println);
//        e1.getPartecipazioni().forEach(System.out::println);
        //personaDao.delete(2);

//        Concerto c1 = new Concerto();
//        Concerto c2 = new Concerto();
//        Concerto c3 = new Concerto();
//        c1.setGenere(Genere.CLASSICO);
//        c1.setDescrizione("concerto");
//        c1.setNumeroMassimoPartecipanti(1000);
//
//        c1.setInStreaming(true);
//        eventoDao.save(c1);
//        eventoDao.save(c2);
//        eventoDao.save(c3);
//
//        eventoDao.getConcertiInStreaming(false).stream().forEach(concerto -> System.out.println(concerto));








    }
}
