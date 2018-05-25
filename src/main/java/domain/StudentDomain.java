<<<<<<< HEAD
package domain;

import java.util.Date;

public class StudentDomain {
    private long id;
    private String pnumber;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String telNumber;
    private String adress;
    private String postzip;
    private String city;



    public StudentDomain(String pnumber,  String firstname, String lastname, Date dateOfBirth, String telNumber, String adress, String postzip, String city) {
        this.pnumber = pnumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
        this.adress = adress;
        this.postzip = postzip;
        this.city = city;

    }

    public StudentDomain(long id, String pnumber, String firstname, String lastname, Date dateOfBirth, String telNumber, String adress, String postzip, String city) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

public class StudentDomain {
    private long id;
    private String pnumber;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String dateOfBirth;
    private String telNumber;
    private String adress;
    private String postzip;
    private String city;
    private String country;


    public StudentDomain(String pnumber, String email, String firstname, String lastname, String password, String dateOfBirth, String telNumber, String adress, String postzip, String city, String country) {
        this.pnumber = pnumber;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
        this.adress = adress;
        this.postzip = postzip;
        this.city = city;
        this.country = country;
    }

    public StudentDomain(long id, String pnumber, String email, String firstname, String lastname, String password, String dateOfBirth, String telNumber, String adress, String postzip, String city, String country) {
        this.id = id;
        this.pnumber = pnumber;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
        this.adress = adress;
        this.postzip = postzip;
        this.city = city;
        this.country = country;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
>>>>>>> 76a7c005a05286c394d6c6648f0aedff7fd1c139
