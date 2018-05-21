package jsf;

import domain.StudentDomain;
import ejb.StudentService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@ManagedBean
@RequestScoped
public class StudentsBean {
    private Long id;
    @NotNull (message = "*")
    @Pattern(regexp = "[0-9]{6}-[0-9]{4}", message = "YYYYMMDD-NNNN")
    private String pnumber;
    @NotNull (message = "*")
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", message = "Exemple@email.com")
    private String email;
    @NotNull (message = "*")
    private String firstname;
    @NotNull (message = "*")
    private String lastname;
    @NotNull (message = "*")
    private String password;
    //@Past
    @NotNull (message = "*")
    @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}", message = "YYYY-MM-DD")
    private String dateOfBirth;
    @NotNull (message = "*")
    @Pattern(regexp = "[0-9]{4}-[0-9]{6}", message = "0700-000000")
    private String telNumber;
    @NotNull (message = "*")
    private String adress;
    @NotNull (message = "*")
    private String postzip;
    @NotNull (message = "*")
    private String city;
    @NotNull (message = "*")
    private String country;
    @AssertTrue (message = "*")
    private boolean agree;

    @EJB
    StudentService studentService;
    public void addUser(){
        if (getId()==null)
        studentService.addStudent(new StudentDomain(getPnumber(), getEmail(),getFirstname(), getLastname(), getPassword(), getDateOfBirth(), getTelNumber(), getAdress(), getPostzip(), getCity(), getCountry()));
        else
            studentService.updateStudent(new StudentDomain(getId(), getPnumber(), getEmail(), getFirstname(), getLastname(), getPassword(), getDateOfBirth(), getTelNumber(), getAdress(), getPostzip(), getCity(), getCountry()));

        setId(null);
        setPnumber("");
        setEmail("");
        setFirstname("");
        setLastname("");
        setPassword("");
        setDateOfBirth("");
        setTelNumber("");
        setAdress("");
        setPostzip("");
        setCity("");
        setCountry("");
        setAgree(false);
    }

    public String editUser(Long id){
        StudentDomain studentDomain = studentService.getStudent(id);
        setId(studentDomain.getId());
        setPnumber(studentDomain.getPnumber());
        setEmail(studentDomain.getEmail());
        setFirstname(studentDomain.getFirstname());
        setLastname(studentDomain.getLastname());
        setPassword(studentDomain.getPassword());
        setDateOfBirth(studentDomain.getDateOfBirth());
        setTelNumber(studentDomain.getTelNumber());
        setAdress(studentDomain.getAdress());
        setPostzip(studentDomain.getPostzip());
        setCity(studentDomain.getPostzip());
        setCountry(studentDomain.getCountry());

        return "user";
    }

    public String removeUser(Long id){
        studentService.removeStudent(id);
        return "user";
    }

    public String getSubmitButtonLabel(){
        if (id==null)
            return "Register";
        else
            return "Update";
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

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }
}
