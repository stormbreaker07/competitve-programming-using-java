package learnHybernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class CheckConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String username = "tanuj";
        String password = "tanuj";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url , username , password);
                System.out.println("connection stablished");

            }catch(Exception e) {
                e.printStackTrace();
            }
    }
}
