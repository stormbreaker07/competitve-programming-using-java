package com.example.loginApp;

import java.util.HashMap;

public class loginService{

    HashMap<String , String> data = new HashMap<>();

    public loginService() {
        data.put("yadav" , "tanuj");
        data.put("Yadav" , "mritunjay");
        data.put("yADAV" , "megha");
        data.put("yaDav" , "viwaan");
    }

    public boolean authenticate(String username , String password) {
        if(password== null || password.trim() == "") {
            return false;
        }
        return true;
    }

    public String getUserName(String password) {
        return data.get(password);
    }


}
