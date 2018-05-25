package jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import domain.StudentDomain;
import domain.TeacherDomain;
import domain.UsersDomain;
import ejb.StudentService;
import ejb.TeacherService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.*;
import java.util.Date;

@ManagedBean
@RequestScoped
public class MemberBean {
    //to know who you register the data
    @NotNull(message = "*")
    private String profil;
    private Long id;
    // users parameter
    @NotNull(message = "*")
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", message = "Exemple@email.com")
    private String email;
    @NotNull(message = "*")
    @Size(min = 8, max = 15, message = "8 =< size =< 15")
    private String password;
    //Students and teacher parametre
    @NotNull(message = "*")
    @Pattern(regexp = "[0-9]{6}-[0-9]{4}", message = "YYYYMMDD-NNNN")
    private String pnumber;
    /*@NotNull (message = "*")
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", message = "Exemple@email.com")
    private String email;*/
    @NotNull(message = "*")
    private String firstname;
    @NotNull(message = "*")
    private String lastname;
    @Past
    @NotNull(message = "*")
    //@Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}", message = "YYYY-MM-DD")
    private Date dateOfBirth;
    @NotNull(message = "*")
    @Pattern(regexp = "[0-9]{4}-[0-9]{6}", message = "0700-000000")
    private String telNumber;
    @NotNull(message = "*")
    private String adress;
    @NotNull(message = "*")
    @Pattern(regexp = "[0-9]{5}", message = "Ex 12345")
    private String postzip;
    @NotNull(message = "*")
    private String city;

    @AssertTrue(message = "*")
    private boolean agree;

    @EJB
    StudentService studentService;
    @EJB
    TeacherService teacherService;

    public void addUser() {
        if (profil.equals("student"))
            if (getId() == null) {
                studentService.addStudent(new StudentDomain(getPnumber(), getFirstname(), getLastname(), getDateOfBirth(), getTelNumber(), getAdress(), getPostzip(), getCity()), new UsersDomain(getEmail(), getPassword()));

            } else {
                studentService.updateStudent(new StudentDomain(getId(), getPnumber(), getFirstname(), getLastname(), getDateOfBirth(), getTelNumber(), getAdress(), getPostzip(), getCity()), new UsersDomain(getId(), getEmail(), getPassword()));

            }
        else if (getId() == null)
            teacherService.addTeacher(new TeacherDomain(getPnumber(), getFirstname(), getLastname(), getDateOfBirth(), getTelNumber(), getAdress(), getPostzip(), getCity()), new UsersDomain(getEmail(), getPassword()));

        else
            teacherService.updateTeacher(new TeacherDomain(getId(), getPnumber(), getFirstname(), getLastname(), getDateOfBirth(), getTelNumber(), getAdress(), getPostzip(), getCity()), new UsersDomain(getId(), getEmail(), getPassword()));



        setProfil("");
        setId(null);
        setEmail("");
        setPassword("");
        setPnumber("");
        setFirstname("");
        setLastname("");
        setDateOfBirth(null);
        setTelNumber("");
        setAdress("");
        setPostzip("");
        setCity("");
        setAgree(false);
    }

    public String editUser(Long id) {
        StudentDomain studentDomain = studentService.getStudent(id);
        setId(studentDomain.getId());
        setPnumber(studentDomain.getPnumber());
        setFirstname(studentDomain.getFirstname());
        setLastname(studentDomain.getLastname());
        setDateOfBirth(studentDomain.getDateOfBirth());
        setTelNumber(studentDomain.getTelNumber());
        setAdress(studentDomain.getAdress());
        setPostzip(studentDomain.getPostzip());
        setCity(studentDomain.getPostzip());


        return "user";
    }

    public String removeUser(Long id) {
        studentService.removeStudent(id);
        return "user";
    }

    public String getSubmitButtonLabel() {
        if (id == null)
            return "Register";
        else
            return "Update";
    }

    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful",  "new: "+profil ) );

    }




    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }
}
