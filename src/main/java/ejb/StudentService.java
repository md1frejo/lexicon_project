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
    UsersDomain getUsers(Long id);
    void removeStudent(Long id);
    List<UsersDomain> getUsers();
  public List<StudentDomain> getStudentsPNumberContain(String filter);
}
