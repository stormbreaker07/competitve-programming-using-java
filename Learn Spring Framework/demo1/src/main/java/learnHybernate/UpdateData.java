package learnHybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateData {

    public static void main(String[] args) {

        SessionFactory con = new Configuration().configure("hybernateConfig.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

    try {
//        Session session =  con.getCurrentSession();
//        session.beginTransaction();
//        Student student = session.get(Student.class , 1);
//        student.setFirstName("micheal");
//        session.getTransaction().commit();

        Session session =  con.getCurrentSession();
        session.beginTransaction();
        session.createQuery("update Student set email='noOneknows@gmail.com'").executeUpdate();
        session.getTransaction().commit();

    } catch(Exception e) {
        e.printStackTrace();
        }
    finally {
        con.close();
    }

    }


}
