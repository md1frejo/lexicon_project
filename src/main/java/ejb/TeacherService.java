package ejb;

import domain.TeacherDomain;
import domain.UsersDomain;

import javax.ejb.Local;
import java.util.List;

@Local
public interface TeacherService {
    void addTeacher(TeacherDomain teacher, UsersDomain users);
    void  updateTeacher(TeacherDomain teacher, UsersDomain users);
    TeacherDomain getTeacher(Long id);
    void removeTeacher(Long id);
    List<TeacherDomain> getTeaches();
    public List<TeacherDomain> getStudentsPNumberContain(String filter) ;
}
