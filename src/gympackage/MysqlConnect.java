
package gympackage;
import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
Connection conn=null;
public static Connection ConnectDB(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","12112003");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","12112003");
//        JOptionPane.showMessageDialog(null,"Connected to database" + conn);
        return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}
}