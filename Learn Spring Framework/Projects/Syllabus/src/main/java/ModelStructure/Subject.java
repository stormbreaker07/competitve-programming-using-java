package ModelStructure;

import javax.persistence.*;

@Entity
@Table(name = "Subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private String year;
    @Column(name = "sem")
    private String sem;
    @Column(name = "name")
    private String name;

    public Subject() {

    }

    public Subject(String year , String sem , String name) {
        this.year = year;
        this.name = name;
        this.sem = sem;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                "year='" + year + '\'' +
                ", sem='" + sem + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
