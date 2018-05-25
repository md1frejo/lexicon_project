package ejb;

import domain.TeacherDomain;
import domain.UsersDomain;
import jpa.Teacher;
import jpa.Users;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class TeacherServiceImpli implements TeacherService{

    @PersistenceContext
    EntityManager em;



    @Override
    public void addTeacher(TeacherDomain teacher, UsersDomain users) {
        Teacher teacher1 = new Teacher( teacher.getPnumber(), teacher.getFirstname(), teacher.getLastname(), teacher.getDateOfBirth(), teacher.getTelNumber(), teacher.getAdress(), teacher.getPostzip(), teacher.getCity());
        em.persist(teacher1);
        Users users1 = new Users(users.getEmail(),users.getPassword(), teacher1);
        em.persist(users1);

    }

    @Override
    public void updateTeacher(TeacherDomain teacher, UsersDomain users) {
        Teacher teacher1 = em.find(Teacher.class, teacher.getId());
        teacher1.setPnumber(teacher.getPnumber());
        teacher1.setFirstname(teacher.getFirstname());
        teacher1.setLastname(teacher.getLastname());
        teacher1.setDateOfBirth(teacher.getDateOfBirth());
        teacher1.setTelNumber(teacher.getTelNumber());
        teacher1.setAdress(teacher.getAdress());
        teacher1.setPostzip(teacher.getPostzip());
        teacher1.setCity(teacher.getCity());
        em.merge(teacher1);

        Users users1 = em.find(Users.class, users.getId());
        users1.setEmail(users.getEmail());
        users1.setPassword(users.getPassword());
        em.merge(users1);

    }

    @Override
    public TeacherDomain getTeacher(Long id) {
        Teacher teacher1 = em.find(Teacher.class, id);
        return new TeacherDomain(teacher1.getId(), teacher1.getPnumber(), teacher1.getFirstname(), teacher1.getLastname(), teacher1.getDateOfBirth(), teacher1.getTelNumber(), teacher1.getAdress(), teacher1.getPostzip(), teacher1.getCity());
    }

    @Override
    public void removeTeacher(Long id) {
        Teacher teacher1 = em.find(Teacher.class, id);
        em.remove(teacher1);

    }

    @Override
    public List<TeacherDomain> getTeaches() {
        return null;
    }

    @Override
    public List<TeacherDomain> getStudentsPNumberContain(String filter) {
        List<Teacher> list = em.createNamedQuery("selectPNumberT").setParameter("filt", filter).getResultList();
        return list.stream()
                .map(teacher -> new TeacherDomain(teacher.getId(), teacher.getPnumber(), teacher.getFirstname(), teacher.getLastname(),
                        teacher.getDateOfBirth(), teacher.getTelNumber(), teacher.getAdress(), teacher.getPostzip(), teacher.getCity()))
                .collect(Collectors.toList());
    }
}
