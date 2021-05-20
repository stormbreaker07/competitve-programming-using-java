package dao;


import Model.UserModel;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userMethod implements Result {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void add(UserModel userModel) {
        System.out.println(userModel);
        sessionFactory.getCurrentSession().saveOrUpdate(userModel);
    }

    @Override
    public List<UserModel> allUser() {
        return sessionFactory.getCurrentSession().createQuery("select a from UserModel a" , UserModel.class).list();
    }

    @Override
    public UserModel FindUser(int emid) {

        return sessionFactory.getCurrentSession().get(UserModel.class , emid);
    }


}
