package domain;

/**
 * Created by Solidbeans on 2017-03-20.
 */
public class CourseDomain {

    private Long course_id;
    private String name;
    private String start;
    private String end;
    private String location;

    public CourseDomain(Long course_id, String name, String start, String end, String location) {
        this.course_id = course_id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.location = location;
    }

    public CourseDomain(String name, String start, String end, String location) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.location = location;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
