package jsf;

import domain.StudentDomain;
import ejb.StudentMethods;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

/**
 * Created by Solidbeans on 2017-03-20.
 */

@ManagedBean
@RequestScoped
public class Student {
    private Long id;
    private String firstname;
    private String lastname;
    private String myFilter;
    @EJB
    StudentMethods studentMethods;

    public String addStudent(){
        if (getId()==null)
            studentMethods.addStudent(new StudentDomain(getFirstname(),getLastname()));
        else
            studentMethods.updateStudent(new StudentDomain(getId(),getFirstname(),getLastname()));

        setId(null);
        setFirstname("");
        setLastname("");
        return "Student";
    }
    public String editStudent(Long id){
        StudentDomain StudentDomain = studentMethods.getStudent(id);
        setId(StudentDomain.getId());
        setFirstname(StudentDomain.getFirstName());
        setLastname(StudentDomain.getLastName());
        return "Student";
    }
    public String removeStudent(Long id){
        studentMethods.removeStudent(id);
        return "Student";
    }
    public List<StudentDomain> getStudents(){

        return studentMethods.getStudents();
    }
    public List<StudentDomain> getStudentsFilter(){
        if (myFilter==null || myFilter.equals(""))
            return studentMethods.getStudents();
        else
            return studentMethods.getStudentsFirtsNameContain(myFilter);
    }

    public String getSubmitButtonLabel(){
        if (id==null)
            return "Add";
        else
            return "Update";
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMyFilter() {
        return myFilter;
    }

    public void setMyFilter(String myFilter) {
        this.myFilter = myFilter;
    }
}
