package domain;

/**
 * Created by Solidbeans on 2017-03-20.
 */
public class TeacherDomain {
    private long id;
    private String firstName;
    private String lastName;
    private String email_adress;

    public TeacherDomain(long id, String firstName, String lastName, String email_adress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email_adress = email_adress;
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

    public String getEmail_adress() {
        return email_adress;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }
}
