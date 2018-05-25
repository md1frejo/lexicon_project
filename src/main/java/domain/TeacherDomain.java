<<<<<<< HEAD
package domain;

import java.util.Date;

public class TeacherDomain {
    private long id;
    private String pnumber;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String telNumber;
    private String adress;
    private String postzip;
    private String city;

    public TeacherDomain( String pnumber, String firstname, String lastname, Date dateOfBirth, String telNumber, String adress, String postzip, String city) {
        this.pnumber = pnumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
        this.adress = adress;
        this.postzip = postzip;
        this.city = city;
    }

    public TeacherDomain(long id,  String pnumber,  String firstname, String lastname,  Date dateOfBirth, String telNumber, String adress, String postzip, String city) {
        this.id = id;
        this.pnumber = pnumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
        this.adress = adress;
        this.postzip = postzip;
        this.city = city;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostzip() {
        return postzip;
    }

    public void setPostzip(String postzip) {
        this.postzip = postzip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
=======
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
>>>>>>> 76a7c005a05286c394d6c6648f0aedff7fd1c139
