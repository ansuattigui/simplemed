package br.com.simplemed.business.registrations.boundary;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author adam-bien.com
 */
public class RegistrationService {

    private EntityManager em;
    private EntityManagerFactory emf;
//    private EntityTransaction et;

    @PostConstruct
    public void init() {
        this.emf = Persistence.createEntityManagerFactory("simplemed");
        this.em = this.getEmf().createEntityManager();
//        this.et = this.getEm().getTransaction();
    }
/*
    public List<Attendee> all() {
        return this.em.createNamedQuery(Attendee.findAll).getResultList();
    }

    public Attendee save(Attendee attendee) {
        et.begin();
        Attendee merged = this.em.merge(attendee);
        et.commit();
        return merged;
    }

    public void save() {
        et.begin();
        em.flush();
        et.commit();
    }

    public void remove(Attendee attendee) {
        et.begin();
        this.em.remove(attendee);
        et.commit();
    }

    public void close() {
        et.begin();
        et.commit();
        em.close();
    }
*/

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @return the emf
     */
    public EntityManagerFactory getEmf() {
        return emf;
    }

}
