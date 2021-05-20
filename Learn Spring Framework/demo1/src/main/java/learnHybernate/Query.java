package learnHybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Query {

    public static void main(String[] args) {

        SessionFactory con = new Configuration().configure("hybernateConfig.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        try {
            Session session = con.getCurrentSession();
            session.beginTransaction();
            List<Student> students = session.createQuery("from Student s where s.lastName ='puth'").getResultList();
            for(Student x : students) {
                System.out.println(x);
            }
            session.getTransaction().commit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
