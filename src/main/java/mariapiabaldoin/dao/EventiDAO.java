package mariapiabaldoin.dao;

import mariapiabaldoin.entities.Concerto;
import mariapiabaldoin.entities.Evento;
import mariapiabaldoin.entities.Genere;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class EventiDAO {
    private EntityManager em;

    public EventiDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Evento evento) {

        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(evento);
        t.commit();
        System.out.println("Evento " + evento.getTitolo() + " salvato");

    }

    public Evento getById(long id) {
        return em.find(Evento.class, id);
    }


    public List<Concerto> getConcertiInStreaming() {
        TypedQuery<Concerto> query = em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = true", Concerto.class);
        return query.getResultList();
    }


    public List<Concerto> getConcertiPerGenere(Genere genere) {
        TypedQuery<Concerto> query = em.createQuery("SELECT c FROM Concerto c WHERE c.genere = :genere", Concerto.class);
        query.setParameter("genere", genere);
        return query.getResultList();
    }


}
