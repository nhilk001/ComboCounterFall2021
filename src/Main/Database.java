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
            String dbUrl = "jdbc:mysql://localhost/sys";
            String user = "root";
            String pass = "323531n$H";
            conn = DriverManager.getConnection(dbUrl, user, pass);
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
        String query = "SELECT username FROM user WHERE email = '" + username + "' AND password = " + password;
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
            return 0;
        }
        return 0;
    }

    /**
     * registers new user into user table
     *
     * @param username
     * @param password
     * @return 1 if complete 0 if not
     */
    public int registerUser(String email, String password, String age, String weight) {
        System.out.println(email);
        System.out.println(password);
        System.out.println(age);
        System.out.println(weight);
        
        String query = "INSERT INTO user (email, password, age, weight) VALUES ('" + email + "', " + password 
                + ", " + age + ", " + weight + ");";
        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int insertForceActivity(String email, int forceGoal, int totalForce,
            int timerSec, int timerMin) {

        String query = "INSERT INTO forcemode (email, forceGoal, totalForce, timerSec, "
                + "timerMin) VALUES ('" + email + "', " + forceGoal + ", " + totalForce + ", "
                + timerSec + ", " + timerMin + ");";
        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int insertTimedActivity(String email, int totalForce,
            int timerSec, int timerMin) {

        String query = "INSERT INTO forcemode (email, totalForce, timerSec, "
                + "timerMin) VALUES ('" + email + "', " + totalForce + ", "
                + timerSec + ", " + timerMin + ");";
        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
}
