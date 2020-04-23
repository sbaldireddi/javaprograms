package oracle.jdbc.driver;

import java.sql.*;
public class ConnTest {
    public static void main(String[] args) {
        oracle.jdbc.driver.OracleDriver driver=new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(driver);
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","tiger","SCOTT");
        if (con==null){
            System.out.println("Connection is not established");
        }else {
            System.out.println("Connetion is established");
        }
    }
}
