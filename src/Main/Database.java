package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author nshilk
 *
 * - all database functions need to be done through this class and called as
 * methods where needed - may need to incorporate waiting for the database to
 * return that the query has completed to keep data correct -
 * https://www.geeksforgeeks.org/how-to-use-preparedstatement-in-java/
 */
public class Database {

    private static Connection conn = null;

    /**
     *
     */
    public Database() {
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/?"
                    + "user=root&password=323531n$H");
        } catch (Exception e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    /**
     * Checks if user has a account in the system
     *
     * @param username
     * @param password
     * @return 1 for user and pass correct 0 if not
     */
    public int loginUser(String username, String password) {
        String query = "SELECT username FROM login WHERE username = " + username + "AND password = " + password;

        try ( Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                String userCheck = rs.getString("username");
                if (username.equals(userCheck)) {
                    return 1;
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }
}
