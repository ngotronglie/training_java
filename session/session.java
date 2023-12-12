
package session;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;

public class session {

    public static void main(String[] args) {
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=hangHoa;user=sa;password=12345678";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
//            System.out.println("conect successfully ket noi thanh cong");
            String SQL = "select * from HANG";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString("MAHANG") + " -- " + rs.getString("TENHANG") + " -- "+ rs.getString("SOLUONG") + " -- " + rs.getString("DONGGIA") + " -- " + rs.getString("XUATXU"));
            }
        } 
        catch (SQLException e) {
            System.out.println("loi");
            e.printStackTrace();
        }
    }
}
