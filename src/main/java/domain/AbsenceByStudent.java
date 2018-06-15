package domain;

import java.util.List;

public class AbsenceByStudent {
    private String personal_Number;
    private String firstName;
    private String lastNmae;
    private String courses_Name;
    private List<Long> absence_Hours;


    public AbsenceByStudent(String personal_Number, String firstName, String lastNmae, String courses_Name, List<Long> absence_Hours) {
        this.personal_Number = personal_Number;
        this.firstName = firstName;
        this.lastNmae = lastNmae;
        this.courses_Name = courses_Name;
        this.absence_Hours = absence_Hours;
    }



    public String getPersonal_Number() {
        return personal_Number;
    }

    public void setPersonal_Number(String personal_Number) {
        this.personal_Number = personal_Number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
    }

    public String getCourses_Name() {
        return courses_Name;
    }

    public void setCourses_Name(String courses_Name) {
        this.courses_Name = courses_Name;
    }

    public List<Long> getAbsence_Hours() {
        return absence_Hours;
    }

    public void setAbsence_Hours(List<Long> absence_Hours) {
        this.absence_Hours = absence_Hours;
    }
}
