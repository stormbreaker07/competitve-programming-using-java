package Connection;

import entity.*;
import entity.inheritence.Bike;
import entity.inheritence.Car;
import entity.inheritence.Vechile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
//        UserDetails112 userDetails112 = new UserDetails112();
//        userDetails112.setFull_name("Tanuj yadav");
//        userDetails112.setUserId(1);

//        ArrayList<Address> address = new ArrayList<>();
//        Address x1 = new Address("uttarpradesh" , "moradabad" , "244001");
//        address.add(x1);
//        x1 = new Address("himachal" , "shimla" , "202323");
//        address.add(x1);
//        User user = new User("Tanuj yadav" , address);
//
//        Student student = new Student();
//
//        ArrayList<Course> courses = new ArrayList<>();
//        Course temp = new Course();
//        temp.setCourse_name("mathematics");
//        temp.setStudent(student);
//        courses.add(temp);
//        Course temp1 = new Course();
//        temp1.setCourse_name("BlockChain");
//        temp1.setStudent(student);
//        courses.add(temp1);
//
//        student.setCourses(courses);
//        student.setName("Tanuj");
//
//        temp1.setStudent(student);
//        temp.setStudent(student);


        Car c = new Car();
        c.setName("Jeep Compas");
        c.setNumberOfTires(4);

        Vechile v = new Vechile();
        v.setName("parent class");

        Bike b = new Bike();
        b.setName("Ktm Duke");
        b.setNumberOfTires(2);

        session.save(c);
        session.save(v);
        session.save(b);
        session.getTransaction().commit();

    }

}
