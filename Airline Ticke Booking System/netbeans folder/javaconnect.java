
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/atbs","root","");
            System.out.println("Database Connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
            
        }
        
        
        
    }
    
}
