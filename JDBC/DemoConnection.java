import java.sql.DriverManager;
import java.sql.*;
public class DemoConnection {
    
    public static void main(String[] args) 
    
    {

        try 
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //Class.forName("com.mysql.jdbc.Driver");
        Connection =con DriverManager.getConnection("jdbc:oracle:think:@localhost:1521:orc1\r\n","system","oracle99");
        //system = user id,  pwd = oracle99
        //Connection = con DriverManager.getConnection("jdbc.mysql:")

        System.out.println("connected with database");

        } /*catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }*/
    }
}