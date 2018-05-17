package ejb;

import domain.CourseDomain;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Solidbeans on 2017-03-20.
 */

@Local
public interface CourseService {

    void addCourse(CourseDomain Course);
    void updateCourse(CourseDomain Course);
    CourseDomain getCourse(Long id);
    void removeCourse(Long id);
}
