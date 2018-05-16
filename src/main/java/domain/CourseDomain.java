package domain;

/**
 * Created by Solidbeans on 2017-03-20.
 */
public class CourseDomain {
    private long id;
    private String name;
    private String start;
    private String end;
    private String location;

    public CourseDomain(String firstName, String lastName, String email_adress) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
