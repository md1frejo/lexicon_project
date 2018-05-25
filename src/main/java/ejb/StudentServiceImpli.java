<<<<<<< HEAD
package ejb;

import domain.StudentDomain;
import domain.UsersDomain;
import jpa.Student;
import jpa.Users;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class StudentServiceImpli implements StudentService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void addStudent(StudentDomain student, UsersDomain users) {
        Student student1 = new Student(student.getPnumber(), student.getFirstname(), student.getLastname(),  student.getDateOfBirth(), student.getTelNumber(), student.getAdress(), student.getPostzip(), student.getCity());
        entityManager.persist(student1);
        Users users1 = new Users(users.getEmail(), users.getPassword(),student1);
        entityManager.persist(users1);


    }

    @Override
    public void updateStudent(StudentDomain student, UsersDomain users) {
        Student student1 = entityManager.find(Student.class, student.getId());
        student1.setPnumber(student.getPnumber());
        student1.setFirstname(student.getFirstname());
        student1.setLastname(student.getLastname());
        student1.setDateOfBirth(student.getDateOfBirth());
        student1.setTelNumber(student.getTelNumber());
        student1.setAdress(student.getAdress());
        student1.setPostzip(student.getPostzip());
        student1.setCity(student.getCity());
        entityManager.merge(student1);

        Users users1 = entityManager.find(Users.class, users.getId());
        users1.setEmail(users.getEmail());
        users1.setPassword(users.getPassword());
        entityManager.merge(users1);

    }

    @Override
    public StudentDomain getStudent(Long id) {
       Student student1 = entityManager.find(Student.class, id);
       return new StudentDomain(student1.getId(), student1.getPnumber(), student1.getFirstname(), student1.getLastname(), student1.getDateOfBirth(),student1.getTelNumber(),student1.getAdress(),student1.getPostzip(), student1.getCity());
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
        List<Student> list = entityManager.createNamedQuery("selectPNumberS").setParameter("filt", filter).getResultList();
        return list.stream()
                .map(student -> new StudentDomain(student.getId(), student.getPnumber(), student.getFirstname(), student.getLastname(),
                        student.getDateOfBirth(), student.getTelNumber(), student.getAdress(), student.getPostzip(), student.getCity()))
                .collect(Collectors.toList());
    }
}
=======
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
>>>>>>> 76a7c005a05286c394d6c6648f0aedff7fd1c139
