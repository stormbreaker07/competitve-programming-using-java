package services;


import Model.UserModel;
import dao.Result;
import dao.userMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GetUserData {

    @Autowired
    public userMethod dao;

    public void addUserAndCrush(UserModel userModel) {
        dao.add(userModel);
    }

    public List<UserModel> getAlluser() {
        return dao.allUser();
    }
    public UserModel findUser(int emid) {
        return dao.FindUser(emid);
    }

}
