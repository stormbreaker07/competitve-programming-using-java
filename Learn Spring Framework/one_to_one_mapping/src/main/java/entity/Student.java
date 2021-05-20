package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String name;

    //for one to one
    //    @OneToOne(cascade = {CascadeType.ALL})
    //    private Course course;


    //for one to many
    @OneToMany(cascade = {CascadeType.ALL})
    private Collection<Course> courses = new ArrayList<>();



    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
