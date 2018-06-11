package ejb;

/* Created by Jonas */

import domain.CourseDomain;
import jpa.Course;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class CourseServiceImpli implements CourseService {

    @PersistenceContext
    EntityManager em;

    @Override
    public void addCourse(CourseDomain Courses) {
        Course course1 = new Course(Courses.getName(),Courses.getStart(),Courses.getEnd(),Courses.getLocation());
        em.persist(course1);
    }

    @Override
    public void updateCourse(CourseDomain Courses) {
        Course courses1 = em.find(Course.class, Courses.getCourse_id());
        courses1.setName(courses1.getName());
        courses1.setStart(courses1.getStart());
        courses1.setEnd(courses1.getEnd());
    }

    @Override
    public void removeCourse(Long id) {
        Course course1 = em.find(Course.class, id);
        em.remove(course1);
    }

    @Override
    public CourseDomain getCourse(Long id) {
        Course course1 = em.find(Course.class, id);
        return new CourseDomain(course1.getId(),course1.getName(),course1.getStart(),course1.getEnd(),course1.getStart());
    }

    @Override
    public List<CourseDomain> getCourses(String filter) {
        List<Course> list = em.createNamedQuery("cselectName").setParameter("filt", filter).getResultList();
        return list.stream().map(c1 -> new CourseDomain(c1.getId(),c1.getName(),c1.getStart(),c1.getEnd(),c1.getLocation()))
                .collect(Collectors.toList());
    }
}
