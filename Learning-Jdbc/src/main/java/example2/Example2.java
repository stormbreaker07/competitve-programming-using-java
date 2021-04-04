package example2;

import java.sql.*;

public class Example2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/jdbcPractise?useSSL=false";
        String username = "root";
        String password = "";

        String sql = "SELECT * FROM newProducts";
        try (
                Connection con = DriverManager.getConnection(url , username , password);
                PreparedStatement stmt = con.prepareStatement(sql)
        )
        {
           ResultSet rn = stmt.executeQuery();
           while(rn.next()) {
               int id = rn.getInt("id");
               String name = rn.getString("name");
               double price = rn.getDouble("price");

               System.out.println(id + " " + name + " " + price);
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
