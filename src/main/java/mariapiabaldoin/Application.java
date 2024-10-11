package mariapiabaldoin;


import mariapiabaldoin.dao.EventiDAO;
import mariapiabaldoin.entities.Concerto;
import mariapiabaldoin.entities.Genere;
import mariapiabaldoin.entities.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("giorno-4-15");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventiDAO ed = new EventiDAO(em);

        Concerto concerto1 = new Concerto("Concerto Rock", LocalDate.of(2024, 5, 10), "Concerto all'aperto", TipoEvento.PUBBLICO, 5000, Genere.ROCK, true);
        Concerto concerto2 = new Concerto("Concerto Classico", LocalDate.of(2024, 6, 15), "Concerto al chiuso", TipoEvento.PRIVATO, 3000, Genere.CLASSICO, false);
        Concerto concerto3 = new Concerto("Concerto Pop", LocalDate.of(2024, 7, 20), "Festival estivo", TipoEvento.PUBBLICO, 8000, Genere.POP, true);


        //ed.save(concerto1);
        //ed.save(concerto2);
        //ed.save(concerto3);


        List<Concerto> concertiInStreaming = ed.getConcertiInStreaming();
        concertiInStreaming.forEach(System.out::println);


        List<Concerto> concertiRock = ed.getConcertiPerGenere(Genere.ROCK);
        concertiRock.forEach(System.out::println);


        em.close();
        emf.close();


    }
}