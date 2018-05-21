package ejb;

import domain.StudentDomain;

import javax.ejb.Local;
import java.util.List;

@Local
public interface StudentService {

  void addStudent(StudentDomain student);
  void  updateStudent(StudentDomain student);
    StudentDomain getStudent(Long id);
    void removeStudent(Long id);
    List<StudentDomain> getStudents();
  public List<StudentDomain> getStudentsPNumberContain(String filter) ;
}
