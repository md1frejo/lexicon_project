package ejb;

import domain.StudentDomain;
import jpa.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class StudentServiceImpli implements StudentService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void addStudent(StudentDomain student) {
        Student student1 = new Student(student.getPnumber(), student.getEmail(), student.getFirstname(), student.getLastname(), student.getPassword(), student.getDateOfBirth(), student.getTelNumber(), student.getAdress(), student.getPostzip(), student.getCity(), student.getCountry());
        entityManager.persist(student1);


    }

    @Override
    public void updateStudent(StudentDomain student) {
        Student student1 = entityManager.find(Student.class, student.getId());
        student1.setPnumber(student.getPnumber());
        student1.setEmail(student.getEmail());
        student1.setFirstname(student.getFirstname());
        student1.setLastname(student.getLastname());
        student1.setPassword(student.getPassword());
        student1.setDateOfBirth(student.getDateOfBirth());
        student1.setTelNumber(student.getTelNumber());
        student1.setAdress(student.getAdress());
        student1.setPostzip(student.getPostzip());
        student1.setCity(student.getCity());
        student1.setCountry(student.getCountry());

        entityManager.merge(student1);

    }

    @Override
    public StudentDomain getStudent(Long id) {
        return null;
    }

    @Override
    public void removeStudent(Long id) {
        Student student1 = entityManager.find(Student.class, id);
        entityManager.remove(student1);
    }

    @Override
    public List<StudentDomain> getStudents() {
        return null;
    }

    @Override
    public List<StudentDomain> getStudentsPNumberContain(String filter) {
        return null;
    }
}
