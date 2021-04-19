package database_Connector;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.*;

public class loginVerification {

    public String loginVerify(String email , String Password) {
        String url = "jdbc:mysql://localhost:3306/regitration_data?useSSL=false";
        String username = "root";
        String password = "root";


        String verify = "SELECT * FROM new_registration WHERE email = ? AND password = ?";
        try
        {

            // load and register JDBC driver for MySQL
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = con.prepareStatement(verify);
            stmt.setString(1,email);
            stmt.setString(2,Password);
            ResultSet resultSet = stmt.executeQuery();

                String firstName = "no data present",lastName = null;
                while(resultSet.next()) {

                    firstName = resultSet.getString("firstName");
                    lastName = resultSet.getString("lastName");
                    System.out.println(firstName +" " + lastName);
                }
                return firstName;
        }
        catch(Exception e) {
            e.printStackTrace();

        }

    return "user not registered";
    }
}
