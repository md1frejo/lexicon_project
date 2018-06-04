package ejb;

import domain.StudentDomain;
import domain.UsersDomain;
import jpa.Student;
import jpa.Login;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class StudentServiceImpli implements StudentService {

    @PersistenceContext(unitName = "Persistence-unit")
    EntityManager entityManager;

    @Override
    public void addStudent(StudentDomain student, UsersDomain users) {
        Student student1 = new Student(student.getPnumber(), student.getFirstname(), student.getLastname(),  student.getDateOfBirth(), student.getTelNumber(), student.getAdress(), student.getPostzip(), student.getCity());
        entityManager.persist(student1);
        Login login1 = new Login(users.getEmail(), users.getPassword(),student1);
        entityManager.persist(login1);


    }

    @Override
    public void updateStudent(StudentDomain student, UsersDomain users) {
        Student student1 = entityManager.find(Student.class, student.getId());
        Login login1 = entityManager.find(Login.class, users.getId());
        login1.setEmail(users.getEmail());
        login1.setPassword(users.getPassword());
        student1.setPnumber(student.getPnumber());
        student1.setFirstname(student.getFirstname());
        student1.setLastname(student.getLastname());
        student1.setDateOfBirth(student.getDateOfBirth());
        student1.setTelNumber(student.getTelNumber());
        student1.setAdress(student.getAdress());
        student1.setPostzip(student.getPostzip());
        student1.setCity(student.getCity());
        entityManager.merge(student1);
        entityManager.merge(login1);


    }

    @Override
    public StudentDomain getStudent(Long id) {
      Student student1= entityManager.find(Student.class, id);
       return new StudentDomain(student1.getId(), student1.getPnumber(), student1.getFirstname(), student1.getLastname(), student1.getDateOfBirth(),student1.getTelNumber(),student1.getAdress(),student1.getPostzip(), student1.getCity());
    }

    @Override
    public UsersDomain getUsers(Long id) {
        Login login1 = entityManager.find(Login.class, id);
        return new UsersDomain(login1.getId(), login1.getEmail(), login1.getPassword());
    }

    @Override
    public void removeStudent(Long id) {
        Login login1 = entityManager.find(Login.class, id);
        entityManager.remove(login1);
        /*Student student1 = entityManager.find(Student.class, id);
        entityManager.remove(student1);*/
    }

    @Override
    public List<UsersDomain> getUsers() {
        Query query = entityManager.createQuery("select a from Login a where a.email= :mail and a.password = :pass", Login.class);
        query.setParameter("mail", "halim@gmail.com");
        query.setParameter("pass", "123");

        List<Login> personRecords = query.getResultList();
        System.out.println("user Size " + personRecords.size()) ;

        List<Login> l = entityManager.createNamedQuery("selectAllS").getResultList();

        List<UsersDomain> myList = new ArrayList<>();
        for (Login u:l){
            myList.add(new UsersDomain(u.getId(),u.getEmail(),u.getPassword()));
        }
        return l.stream().
                map(u->new UsersDomain(u.getId(),u.getEmail(),u.getPassword())).
                collect(Collectors.toList());
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
