package databaseOperation;

import ModelStructure.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CrudOperation {

    @Autowired
    private SessionFactory sessionFactory;


    public CrudOperation() {

    }

    public void insert(Subject subject) {

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(subject);
            session.getTransaction().commit();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public List<Subject> getList(String year , String sem) {

        List<Subject> subjects;

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            String hql = "from Subject s where s.year=" + year + " and s.sem=" + sem;
             subjects = session.createQuery(hql).getResultList();
            for(Subject s : subjects) {
                System.out.println(s);
            }
             return subjects;

        }catch(Exception e) {
            e.printStackTrace();
            return new ArrayList<Subject>();
        }
    }



}
