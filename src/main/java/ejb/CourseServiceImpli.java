package ejb;

/* Created by Jonas*/

import domain.CourseDomain;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CourseServiceImpli implements CourseService {

    @PersistenceContext
    EntityManager em;

    @Override
    public void addCourse(CourseDomain Courses) {

    }

    @Override
    public void updateCourse(CourseDomain Courses) {

    }

    @Override
    public CourseDomain getCourse(Long id) {
        return null;
    }

    @Override
    public void removeCourse(Long id) {
    }
}


/*

   void addCourse(CourseDomain Course);
    void updateCourse(CourseDomain Course);
    CourseDomain getCourse(Long id);
    void removeCourse(Long id);

 */