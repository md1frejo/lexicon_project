package ejb;

import domain.StudentDomain;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Solidbeans on 2017-03-20.
 */

@Local
public interface StudentMethods {

    void addStudent(StudentDomain student);
    void updateStudent(StudentDomain student);
    StudentDomain getStudent(Long id);
    void removeStudent(Long id);
    List<StudentDomain> getStudents();
    public List<StudentDomain> getStudentsFirtsNameContain(String filter) ;
}
