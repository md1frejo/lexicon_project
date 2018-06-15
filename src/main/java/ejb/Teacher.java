package jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name="selectPNumberT",query="SELECT t FROM Teacher t WHERE LOCATE(:filt,t.pnumber) >0 ")
})
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "teacher_id")
    private Long id;
    private String pnumber;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String telNumber;
    private String adress;
    private String postzip;
    private String city;

    @OneToOne (mappedBy = "teacher")
    private Login login;

    @OneToMany (mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Courses> coursesList = new ArrayList<Courses>();

    public Teacher() {
    }

    public Teacher( String pnumber, String firstname, String lastname, Date dateOfBirth, String telNumber, String adress, String postzip, String city) {
        this.pnumber = pnumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
        this.adress = adress;
        this.postzip = postzip;
        this.city = city;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }
}
