/*
  Table: Students
  +----+-------+--------+
  | Id | Name  |   Age  |
  +----+-------+--------+
  |  1 | Raimy |   28   |
  |  2 | Sam   |   22   |
  |  3 | colt  |   20   |
  +----+-------+--------+
*/

import java.sql.*;

public class UpdateDataInTable {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    String url = "jdbc:mysql://localhost:/3306/students";

    Class.forName("com.mysql.jdbc.Driver");                                       // Register driver, ClassNotFoundException
    Connection conn = DriverManager.getConnection(url, "root", "root");           // Connect to database
    Statement statement = conn.createStatement();                                 // Create statement
    String query = "UPDATE students SET name = 'John', age = 20 WHERE id = 1";    // Prepare Query
    statement.executeUpdate(query);                                               // Execute query
    conn.close();                                                                 // Close connection

  }
}
