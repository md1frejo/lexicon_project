package jpa;

import javax.persistence.*;

/**
 * Created by Solidbeans on 2017-03-20.
 */
@Entity
@NamedQueries({
        @NamedQuery(name="selectAll",query="SELECT p FROM Person p"),
        @NamedQuery(name="selectSome",query="SELECT t FROM Person t WHERE LOCATE(:filt,t.firstName) >0 ")
})
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
