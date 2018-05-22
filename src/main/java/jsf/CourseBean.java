package jsf;

import domain.CourseDomain;
import ejb.CourseService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CourseBean {

    private Long course_id;
    private Long student_id;
    private Long teacher_id;
    private String student;
    private String course;
    private String teacher;
    private String name;
    private String start;
    private String end;
    private String location;

    /*

    private Long course_id;
    private String name;
    private String start;
    private String end;
    private String location;


    */

    @EJB
    CourseService courseService;

    public void addCourses() {
        if (getCourse_id()==null)
            courseService.addCourse(new CourseDomain(getName(),getStart(),getEnd(),getLocation()));
        else
            courseService.updateCourse(new CourseDomain(getName(),getStart(),getEnd(),getLocation()));

        setCourse_id(null);
        setName("");
        setStart("");
        setEnd("");
        setLocation("");
    }


    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
