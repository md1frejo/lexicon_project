package ejb;

import domain.CourseDomain;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Solidbeans on 2017-03-20.
 */

@Local
public interface CourseService {

    // administrator



    void addCourse(CourseDomain Course);
    void updateCourse(CourseDomain Course);
    void removeCourse(Long id);
    // everyone
    CourseDomain getCourse(Long id);
    List<CourseDomain> getCourses(String filter);
}
