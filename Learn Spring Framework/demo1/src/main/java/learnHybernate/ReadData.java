package learnHybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadData {

    public static void main(String[] args) {

        SessionFactory con = new Configuration().configure("hybernateConfig.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        try {
            Session session = con.getCurrentSession();
            Student student3 = new Student("adam" , "lambert" , "charlie@gmail.com");
            session.beginTransaction();
            session.save(student3);
            session.getTransaction().commit();

            Session session1 = con.getCurrentSession();
            session1.beginTransaction();
            Student student = session1.get(Student.class , student3.getId());
            System.out.println(student);
            session1.getTransaction().commit();

        }
        catch( Exception e) {
            e.printStackTrace();
        }
        finally {
            con.close();
        }
    }



}
