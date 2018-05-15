package ejb;

import domain.PersonDomain;
import jpa.Person;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Solidbeans on 2017-03-20.
 */

@Stateless
public class PersonServiceImpl implements PersonService{
    @PersistenceContext
    EntityManager em;

    @Override
    public void addPerson(PersonDomain person) {
        Person p = new Person(person.getFirstName(),person.getLastName());
        em.persist(p);
    }

    @Override
    public void updatePerson(PersonDomain person) {
        Person p = em.find(Person.class,person.getId());
        p.setFirstName(person.getFirstName());
        p.setLastName(person.getLastName());
        em.merge(p);

    }

    @Override
    public PersonDomain getPerson(Long id) {
        Person p = em.find(Person.class,id);
        return new PersonDomain(p.getId(),p.getFirstName(),p.getLastName());
    }

    @Override
    public void removePerson(Long id) {
        Person p = em.find(Person.class,id);
        em.remove(p);
    }

    @Override
    public List<PersonDomain> getPersons() {
        Query query = em.createQuery("select a from Person a where a.lastName = :lname and a.firstName = :fname", Person.class);
        query.setParameter("lname", "Karlsson");
        query.setParameter("fname", "Kalle");

        List<Person> personRecords = query.getResultList();
        System.out.println("person Size " + personRecords.size()) ;

        List<Person> l = em.createNamedQuery("selectAll").getResultList();

        List<PersonDomain> myList = new ArrayList<>();
        for (Person p:l){
            myList.add(new PersonDomain(p.getId(),p.getFirstName(),p.getLastName()));
        }
//        return myList;

        return l.stream().
                map(p->new PersonDomain(p.getId(),p.getFirstName(),p.getLastName())).
                collect(Collectors.toList());
    }

    @Override
    public List<PersonDomain> getPersonsFirtsNameContain(String filter) {

        List<Person> l = em.createNamedQuery("selectSome")
                .setParameter("filt",filter).getResultList();

        return l.stream().
                map(p->new PersonDomain(p.getId(),p.getFirstName(),p.getLastName())).
                collect(Collectors.toList());

    }

}
