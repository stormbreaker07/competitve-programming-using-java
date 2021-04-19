package database_Connector;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.*;

public class registration_data {

    public registration_data(String firstName , String secondName , String email , String Password) {
        String url = "jdbc:mysql://localhost:3306/regitration_data?useSSL=false";
        String username = "root";
        String password = "root";


        String inserData = "INSERT INTO new_registration VALUES(? , ? , ? , ?)";
        //String verify = "SELECT * FROM new_registration WHERE email= ? ";
        try
        {

            // load and register JDBC driver for MySQL
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = con.prepareStatement(inserData);
            stmt.setString(1,firstName);
            stmt.setString(2,secondName);
            stmt.setString(3,email);
            stmt.setString(4, Password);
            stmt.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
        }


    }
}
