package ejb;
/* Created by Halim*/
import domain.StudentDomain;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class StudentServiceImpli implements StudentService {

    @PersistenceContext
    EntityManager em;

    @Override
    public void addStudent(StudentDomain student) {

    }

    @Override
    public void updateStudent(StudentDomain student) {

    }

    @Override
    public StudentDomain getStudent(Long id) {
        return null;
    }

    @Override
    public List<StudentDomain> getStudents() {
        return null;
    }
}
