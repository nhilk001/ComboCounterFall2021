package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Set;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
    private LocalTime locTime = LocalTime.now();
    private LocalDate locDate = LocalDate.now();

    /**
     *
     */
    public Database() {
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            String dbUrl = "jdbc:mysql://localhost/combocounter";
            String user = "root";
            String pass = "@A1234567b";
            conn = DriverManager.getConnection(dbUrl, user, pass);
        } catch (Exception e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    /**
     * Checks if user has a account in the system
     *
     * @param email
     * @param password
     * @return 1 for user and pass correct 0 if not
     */
    public int loginUser(String email, String password) {
        String query = "SELECT email FROM user WHERE email=? AND password=?";

        try ( PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setNString(1, email);
            stmt.setNString(2, password);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            if (rs.next()) {
                String userCheck = rs.getString("email");
                if (email.equals(userCheck)) {
                    return 1;
                }
            }

        } catch (SQLException e) {
            System.out.println(e + "login error");
            return 0;
        }
        return 0;
    }

    /**
     * registers new user into user table
     *
     * @param email
     * @param password
     * @param age
     * @param weight
     * @return 1 if complete 0 if not
     */
    public int registerUser(String email, String password, String age, String weight) {

        String query = "INSERT INTO user (email, password, age, weight) VALUES (?,?,?,?);";

        try ( PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setNString(1, email);
            stmt.setNString(2, password);
            stmt.setNString(3, age);
            stmt.setNString(4, weight);
            stmt.executeUpdate();
            return 1;

        } catch (SQLException e) {
            System.out.println(e + " register user error");
            return 0;
        }
    }

    /**
     *
     * @param email
     * @param forceGoal
     * @param totalForce
     * @param timerSec
     * @param timerMin
     * @return
     */
    public int insertForceActivity(String email, int forceGoal, int totalForce,
            int timerSec, int timerMin, String time, String date) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("mm:dd:yyyy a");

        String query = "INSERT INTO forcemode (email, forceGoal, totalForce, timerSec, timerMin, "
                + " timecreated, datecreated) VALUES ('" + email + "', " + forceGoal + ", "
                + totalForce + ", " + timerSec + ", " + timerMin + ", '"
                + time + "', '" + date + "');";

        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;

        } catch (SQLException e) {
            System.out.println(e + " insert force error");
            return 0;
        }
    }

    /**
     *
     * @param email
     * @param totalForce
     * @param timerSec
     * @param timerMin
     * @return
     */
    public int insertTimedActivity(String email, int totalForce,
            int timerSec, int timerMin, String inDate, String inTime) {

        String query = "INSERT INTO timedmode (email, totalForce, timerSec, "
                + "timerMin, timecreated, datecreated) VALUES ('" + email + "', " + totalForce + ", "
                + timerSec + ", " + timerMin + ", '" + inTime+ "', '" + inDate+ "');";

        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;

        } catch (SQLException e) {
            System.out.println(e + " insert timed mode error");
            return 0;
        }
    }

    public int insertComboActivity(String email, int totalForce,
            int timerSec, int timerMin, int punchNum, String time, String date) {

        String query = "INSERT INTO combomode (email, totalForce, timerSec, timerMin, "
                + "punchnum, timecreated, datecreated) VALUES ('" + email + "', " + totalForce + ", "
                + timerSec + ", " + timerMin +", " + punchNum + ", '" + time +"', '" + date+ "');";

        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;

        } catch (SQLException e) {
            System.out.println(e+ " insert Combo error");
            return 0;
        }
    }
    public int insertStrengthActivity(String email, int totalForce,
            int timerSec, int timerMin, String time, String date) {

        String query = "INSERT INTO strengthmode (email, totalForce, timerSec, timerMin, "
                + " timecreated, datecreated) VALUES ('" + email + "', " + totalForce + ", "
                + timerSec + ", " + timerMin  + ", '" + time +"', '" + date+ "');";

        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;

        } catch (SQLException e) {
            System.out.println(e+ " insert Strength error");
            return 0;
        }
    }
    public int insertPunchActivity(String email, int threshold, int numValid, int numInvalid,
            int timerSec, int timerMin, String time, String date) {

        String query = "INSERT INTO punchmode (email, threshold, valid, invalid, timerSec, timerMin, "
                + " timecreated, datecreated) VALUES ('" + email + "', " + threshold + ", " + numValid+", " + numInvalid+", " 
                + timerSec + ", " + timerMin  + ", '" + time +"', '" + date+ "');";

        try ( Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            return 1;

        } catch (SQLException e) {
            System.out.println(e + " insert punch error" );
            return 0;
        }
    }
    /**
     * Gets all entries in forcemode table that belong to user ided by email
     *
     * @param email
     * @return arraylist of all entries with type Activity
     */
    public ArrayList<Activity> getForceActivities(String email) {
        ArrayList<Activity> activities = new ArrayList(10);
        String query = "SELECT * FROM forcemode WHERE email=? ;";

        try ( PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int goalForce = rs.getInt("forceGoal");
                int totalForce = rs.getInt("totalForce");
                int min = rs.getInt("timerSec");
                int sec = rs.getInt("timerMin");
                String timeCreated = rs.getNString("timecreated");
                String dateCreated = rs.getNString("datecreated");
                //TODO correct activity object and line below
                Activity act = new Activity(min, sec, timeCreated, dateCreated,
                        "Force Mode", totalForce, goalForce);
                activities.add(act);
            }

            return activities;

        } catch (SQLException e) {
            System.out.println(e + "get force error");
            return null;
        }
    }

    /**
     *
     * @param email
     * @return
     */
    public ArrayList<Activity> getTimedActivities(String email) {
        ArrayList<Activity> activities = new ArrayList(10);
        String query = "SELECT * FROM timedmode WHERE email=? ;";

        try ( PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int totalForce = rs.getInt("totalForce");
                int min = rs.getInt("timerSec");
                int sec = rs.getInt("timerMin");
                String time = rs.getNString("timecreated");
                String date = rs.getNString("datecreated");
                //TODO correct activity object and line below
                Activity act = new Activity(0, sec, time, date,
                        "Force Mode", totalForce, 0);//0 is place holder
                activities.add(act);
            }

            return activities;

        } catch (SQLException e) {
            System.out.println(e + "get timed error");
            return null;
        }
    }
    public ArrayList<Activity> getPunchActivities(String email) {
        ArrayList<Activity> activities = new ArrayList(10);
        String query = "SELECT * FROM punchmode WHERE email=? ;";

        try ( PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int threshold = rs.getInt("threshold");
                int numValid = rs.getInt("valid");
                int numInvalid = rs.getInt("inValid");
                int min = rs.getInt("timerSec");
                int sec = rs.getInt("timerMin");
                String time = rs.getNString("timecreated");
                String date = rs.getNString("datecreated");
                //TODO correct activity object and line below
                Activity act = new Activity(0, sec, time, date,
                        "Punch Mode", threshold, 0);//0 is place holder
                activities.add(act);
            }

            return activities;

        } catch (SQLException e) {
            System.out.println(e + "get punch error");
            return null;
        }
    }
    
    
    public ArrayList<Activity> getStrengthActivities(String email) {
        ArrayList<Activity> activities = new ArrayList(10);
        String query = "SELECT * FROM strengthmode WHERE email=? ;";

        try ( PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int totalForce = rs.getInt("totalforce");
                int min = rs.getInt("timerSec");
                int sec = rs.getInt("timerMin");
                String time = rs.getNString("timecreated");
                String date = rs.getNString("datecreated");
                //TODO correct activity object and line below
                Activity act = new Activity(0, sec, time, date,
                        "Strength Mode", totalForce, 0);//0 is place holder
                activities.add(act);
            }

            return activities;

        } catch (SQLException e) {
            System.out.println(e + "get strength record error");
            return null;
        }
    }
  
    public String DisplayForceHistory(String email) throws SQLException{
        String finalDisplay = "";
        String query = "SELECT * " +
                     "FROM combocounter.forcemode WHERE email=? ;";
       
        try ( PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
//             Statement stmt  = conn.createStatement();
//             ResultSet rs    = stmt.executeQuery(sql)) 
           
            // loop through the result set
            while (rs.next()) {
                finalDisplay = finalDisplay + "Force Mode: " + rs.getString("index") + "\t" + rs.getString("timecreated")  + "\t" +
                                rs.getString("datecreated") + "\n" +
                                " User: " + rs.getString("email")  + "\t" + 
                                "\tForce Goal: " + rs.getString("forceGoal")  + 
                                "\n" + " Time: " + rs.getString("timerMin") + " min " +
                                rs.getString("timerSec") + " sec" + "\t"
                                + "          Total Force: " + rs.getString("totalForce")  + "\n\n";
                    
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return finalDisplay;
    }
    
    public String DisplayTimeHistory(String email){
        String finalDisplay = "";
        String query = "SELECT * " +
                     "FROM combocounter.timedmode WHERE email=? ;";
        
        try (PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            // loop through the result set
            while (rs.next()) {
                finalDisplay = finalDisplay + "Time Mode: " + rs.getString("index") + "\t" + rs.getString("timecreated")  + "\t" +
                                rs.getString("datecreated") + "\n" +
                                " User: " + rs.getString("email")  + "\t" + 
                                "\n" + " Time: " + rs.getString("timerMin") + " min " +
                                rs.getString("timerSec") + " sec" + "\t"
                                + "      Total Force: " + rs.getString("totalForce")  + "\n\n";
                    
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return finalDisplay;
    }   
    
    public String DisplayPunchHistory(String email){
        String finalDisplay = "";
        String query = "SELECT * " +
                     "FROM combocounter.punchmode WHERE email=? ;";
        
        try (PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            // loop through the result set
            while (rs.next()) {
                // Main.username, thresholdForce, validPunches, invalidPunches ,seconds, minutes, inTime, inDate
                finalDisplay = finalDisplay + "Punch Mode: " + rs.getString("index") + "\t" + rs.getString("timecreated")  + "\t" +
                                rs.getString("datecreated") + "\n" +
                                " User: " + rs.getString("email")  + "\t" + 
                                "\n" + " Time: " + rs.getString("timerMin") + " min " +
                                rs.getString("timerSec") + " sec" + "\t"
                                + "         Threshold Force: " + rs.getString("threshold")  + "\n"
                                + " Valid Punches : " + rs.getString("valid") + "\t" 
                                + "         InValid Punches : " + rs.getString("invalid") + "\n\n" ;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return finalDisplay;
    }
    
    public String DisplayStrengthHistory(String email){
        String finalDisplay = "";
        String query = "SELECT * " +
                     "FROM combocounter.strengthmode WHERE email=? ;";
        
        try (PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            // loop through the result set
            while (rs.next()) {
                // Main.username, thresholdForce, validPunches, invalidPunches ,seconds, minutes, inTime, inDate
                finalDisplay = finalDisplay + "Strength Mode: " + rs.getString("index") + "\t" + rs.getString("timecreated")  + "\t" +
                                rs.getString("datecreated") + "\n" +
                                " User: " + rs.getString("email")  + "\t" + 
                                "\n" + " Time: " + rs.getString("timerMin") + " min " +
                                rs.getString("timerSec") + " sec" + "\t"
                                + "          Total Force: " + rs.getString("totalforce")  + "\n\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return finalDisplay;
    }   
    
        public String DisplayComboHistory(String email){
        String finalDisplay = "";
        String query = "SELECT * " +
                     "FROM combocounter.combomode WHERE email=? ;";
        
        try (PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setNString(1, email);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            // loop through the result set
            while (rs.next()) {
                // Main.username, thresholdForce, validPunches, invalidPunches ,seconds, minutes, inTime, inDate
                finalDisplay = finalDisplay + "Combo Mode: " + rs.getString("index") + "\t" + rs.getString("timecreated")  + "\t" +
                                rs.getString("datecreated") + "\n" +
                                " User: " + rs.getString("email")  + "\t" + 
                                "\n" + " Time: " + rs.getString("timerMin") + " min " +
                                rs.getString("timerSec") + " sec" + "\t"
                                + "Total Force: " + rs.getString("totalforce")  + "    " +
                                "Punch numbers : " + rs.getString("punchNum") + "\n\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return finalDisplay;
    }   
}
