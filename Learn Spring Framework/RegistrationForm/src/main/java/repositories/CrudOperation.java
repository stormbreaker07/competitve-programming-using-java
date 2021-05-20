package repositories;

import entity.UserRegistration;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CrudOperation {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(UserRegistration userData) {

        sessionFactory.getCurrentSession().save(userData);
    }

    public List<UserRegistration> findByEmail(String Email) {

        Query query =  sessionFactory.getCurrentSession().createQuery("SELECT a FROM UserRegistration a where a.email = :Email");
        query.setParameter("Email" , Email);
        return query.list();
    }

    public List<UserRegistration> allRows() {
        return sessionFactory.getCurrentSession().createQuery("SELECT a from UserRegistration a").list();
    }


}
