package all_servlet;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class MyConnectionProvider implements MyProvider{
    static Connection con = null;
    public static Connection getCon()
    {
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(username,pwd,conUrL);
        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
}
