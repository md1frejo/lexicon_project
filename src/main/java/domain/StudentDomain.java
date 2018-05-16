package domain;

/**
 * Created by Solidbeans on 2017-03-20.
 */
public class  StudentDomain {
    private long id;
    private String firstName;
    private String lastName;

    public StudentDomain(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentDomain(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
