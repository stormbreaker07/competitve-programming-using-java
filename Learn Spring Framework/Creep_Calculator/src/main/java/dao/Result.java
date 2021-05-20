package dao;

import Model.UserModel;

import java.util.List;

public interface Result {

    public void add(UserModel userMode1);
    public List<UserModel> allUser();
    public UserModel FindUser(int id);

}
