import java.sql.PreparedStatement;
import javax.swing.event.SwingPropertyChangeSupport;

public class DemoConnection1 {
     PreparedStatement pst=con.prepareStatement("insert into course values(?,?,?");
     //(? = this is int ,? = this is string ,? = this is float)
     pst.setInt(1,50);
     pst.setString(2,"data science");
     pst.setFloat(3.9000.0f);
      
     int r=pst.executeUpdate();
     System.out.println("row inserted"+r);

     PreparedStatement pst1=con.prepareStatement("update course set fees=? where course_id=?");
     pst1.setFloat(1,45000);
     pst1.setInt(2,50);

     int r1=pst1.executeUpdate();
     System.out.println("row updated"+r1);

}
