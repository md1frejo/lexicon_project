<<<<<<< HEAD
package ejb;

import domain.StudentDomain;
import domain.UsersDomain;

import javax.ejb.Local;
import java.util.List;

@Local
public interface StudentService {

  void addStudent(StudentDomain student, UsersDomain users);
  void  updateStudent(StudentDomain student, UsersDomain users);
    StudentDomain getStudent(Long id);
    void removeStudent(Long id);
    List<StudentDomain> getStudents();
  public List<StudentDomain> getStudentsPNumberContain(String filter) ;
}
=======
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
>>>>>>> 76a7c005a05286c394d6c6648f0aedff7fd1c139
