package scrollablegui;

import java.sql.Connection;
import java.sql.DriverManager;


public class Scrollable {
    String url = "jdbc:mysql://localhost:3306/signin";
    String username = "root";
    String password = "$$$lamjung$$$@@@";
    void checkConnection(){
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connected");
            //create the connection
            Connection connect =  DriverManager.getConnection(url,username,password);
            if(!connect.isClosed()) {
                System.out.println("Open");
            }
            //close the statement
            connect.close();
        }catch (Exception exp){
            System.out.println(exp);
        }
        
    }
    public static void main(String[] args) {
        Scrollable dem = new Scrollable();
        dem.checkConnection();
       
    }
}