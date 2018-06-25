package jdbcdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLserverconnectivity {

public static void main(String[] args) {
              
              // Create a variable for the connection string.
              String connectionUrl = "jdbc:sqlserver://vmkit-c4ppp001:15026;databaseName=ci_PropertyHelper_dt;integratedSecurity=true;";

              // Declare the JDBC objects.
              Connection con = null;
              Statement stmt = null;
              ResultSet rs = null;
              
             try {
                    // Establish the connection.
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con = DriverManager.getConnection(connectionUrl);
            
                    // Create and execute an SQL statement that returns some data.
                    String SQL = "SELECT top (100) * FROM [ci_PropertyHelper_dt].[dbo].[agr_quot];";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL);
            
                    // Iterate through the data in the result set and display it.
                    while (rs.next()) {
                           int it=1;
                           String temp = "";
                           while(rs.getString(it)!=null) {
                           temp = temp + rs.getString(it) + "\t";
                           it++;
                           }
                           System.out.println(temp);
                    }
             }
        
              // Handle any errors that may have occurred.
              catch (Exception e) {
                     e.printStackTrace();
              }

              finally {
                     if (rs != null) try { rs.close(); } catch(Exception e) {}
                     if (stmt != null) try { stmt.close(); } catch(Exception e) {}
                     if (con != null) try { con.close(); } catch(Exception e) {}
              }
       }
}
