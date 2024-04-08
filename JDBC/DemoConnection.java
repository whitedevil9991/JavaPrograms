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
        Statement st=con.createStatement();
        //creates object
        ResultSet rs=st.executeQuery("Select course_id,course");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
/** (rightclick on project )
 * 
 * commit()
 * rollback()
 * setAutocommit(true)
 * 
 * ---Query---
 * 
 * 1.static query ----- Statement st=con.createStatement();
 * 
 * a.select:select*from student where id=100; -----ResultSet executeQuery()
 * (ResultSet = it is a pointer to the dataTable, executeQuery = it returns ResultSet) 
 * 
 * b.DML(insert update, delete):-------int executeUpdate()
 * insert into student values(100,"abd,89.6f");
 * 
 * 2.dynamic query :-----PreparedStatement pst=con.prepareStatement();
 * (faster the static)
 * 
 * a.select:select*from student where id=?;----- ResultSet executeQuery()
 * 
 * b.DML:insert into student values(?,?,?);-----int executeUpdate()
 * 
 * 3.stored procedure : methods or functions in sql
 * -----CallableStatement cst=con.prepareCall();
 * call-----boolean execute()
 */
