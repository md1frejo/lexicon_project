package domain;

/**
 * Created by Mr. Xiao on 2018-05-17.
 */

public class TeacherDomain {
    private int id;
    private String firstName;
    private String lastName;
    private String email_adress;

    public TeacherDomain(int id, String firstName, String lastName, String email_adress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email_adress = email_adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    public String getemail_adress() {
        return email_adress;
    }

    public void setemail_adress(String email_adress) {
        this.email_adress = email_adress;
    }
}
