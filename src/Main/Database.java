
package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author nshilk
 * 
 * - all database functions need to be done through this class and called as methods where needed
 * - may need to incorporate waiting for the database to return that the query has completed to keep data correct
 * - https://www.geeksforgeeks.org/how-to-use-preparedstatement-in-java/
 */
public class Database {
    
    private static Connection conn = null;
    
    public Database(){
        try{
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/?"+
                    "user=root&password=323531n$H");
        }
        catch(Exception e){
           System.out.println("SQLException: " + e.getMessage());
        }
    }
    public void loginUser(String username, String password){
        //conn.prepareStatement("insert ? ? ", username, password);
        //conn.executeQuery();
    }
}
