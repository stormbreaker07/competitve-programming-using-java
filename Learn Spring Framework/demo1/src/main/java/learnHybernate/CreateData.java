package learnHybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateData {

    public static void main(String[] args) {

        SessionFactory connection = new Configuration().configure("hybernateConfig.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
    try {
    //get current session from session factory
        Session session = connection.getCurrentSession();
        //create student object with data.
        Student student1 = new Student("nick" , "jonas" , "nick@gmail.com");
        Student student2 = new Student("martin" , "garrix" , "martin@gmail.com");
        Student student3 = new Student("charlie" , "puth" , "charlie@gmail.com");
        Student student4 = new Student("charlie" , "puth" , "charlie@gmail.com");
    //start transaction
            session.beginTransaction();
        //save object in the session.
        session.save(student1);
        session.save(student2);
        session.save(student3);
        //commint transaction
            session.getTransaction().commit();


        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
