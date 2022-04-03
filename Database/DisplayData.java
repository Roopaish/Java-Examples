import java.io.*;
import java.sql.*;

public class DisplayData {
  public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
    String url = "jdbc:mysql://localhost:3306/students";
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, "root", "root");
    Statement statement = conn.createStatement();
    String query = "SELECT * FROM students";
    ResultSet resultSet = statement.executeQuery(query);
    while (resultSet.next()) {
      System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getInt("age"));
    }
    conn.close();
  }
}
