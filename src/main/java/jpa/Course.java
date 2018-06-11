package jpa;

import javax.persistence.*;

/* Created by Jonas */

@Entity
@NamedQueries({
        @NamedQuery(name="cselectAll",query="SELECT p FROM Course p"),
        @NamedQuery(name="cselectName",query="SELECT p FROM Course p WHERE LOCATE(:filt,p.name) >0 "),
        @NamedQuery(name="cselectStart",query="SELECT p FROM Course p WHERE LOCATE(:filt,p.start) >0 "),
        @NamedQuery(name="cselectEnd",query="SELECT p FROM Course p WHERE LOCATE(:filt,p.end) >0 "),
        @NamedQuery(name="cselectLocation",query="SELECT p FROM Course p WHERE LOCATE(:filt,p.location) >0 ")
})

public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String start;
    private String end;
    private String location;

    public Course() {
    }

    public Course(String name, String start, String end, String location) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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


