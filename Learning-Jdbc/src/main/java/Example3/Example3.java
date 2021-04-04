package Example3;

import java.sql.*;


public class Example3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/jdbcPractise?useSSL=false";
        String username = "root";
        String password = "";

        String sql = "SELECT * FROM newProducts WHERE price> ?";
        double price = 4;

        try(Connection con = DriverManager.getConnection(url , username , password);
            PreparedStatement stmt = con.prepareStatement(sql)
        )
        {
            stmt.setDouble(1 , price);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + rs.getDouble("price"));
            }

        }
        catch (SQLException e ) {
            e.printStackTrace();
        }




    }
}
