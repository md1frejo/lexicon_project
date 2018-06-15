package domain;

public class CoursesDomain {
    private long id;
    private long teacher_id;
    private String courseName;
    private String dateStart;
    private String dateEnd;
    private boolean canceled;

    public CoursesDomain(long teacher_id, String courseName, String dateStart, String dateEnd, boolean canceled) {
        this.teacher_id = teacher_id;
        this.courseName = courseName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.canceled = canceled;
    }

    public CoursesDomain(long teacher_id, String courseName, String dateStart, String dateEnd) {
        this.teacher_id = teacher_id;
        this.courseName = courseName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public CoursesDomain(long id, long teacher_id, String courseName, String dateStart, String dateEnd, boolean canceled) {
        this.id = id;
        this.teacher_id = teacher_id;
        this.courseName = courseName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.canceled = canceled;
    }

    public CoursesDomain(long id, long teacher_id, String courseName, String dateStart, String dateEnd) {
        this.id = id;
        this.teacher_id = teacher_id;
        this.courseName = courseName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(long teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
