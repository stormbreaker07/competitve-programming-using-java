package entity;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int course_id;
    private String course_name;;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Student student;

//    @OneToOne(cascade = {CascadeType.ALL})
//    private Student student;

    public Course() { }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
