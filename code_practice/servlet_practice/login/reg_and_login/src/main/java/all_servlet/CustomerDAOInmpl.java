package all_servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOInmpl implements CustomerDAO{
    static Connection con;
    static PreparedStatement ps;
    @Override
    public int insertCustomer(Customer c) {
        int status = 0;
        try{
            con = MyConnectionProvider.getCon();
            ps = con.prepareStatement("insert into customer values(?,?)");
            ps.setString(1,c.getUsername());
            ps.setString(2, c.getPassword());
            status = ps.executeUpdate();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }

        return status;
    }

    @Override
    public Customer getCustomer(String username, String password) {
        Customer c = new Customer();
        try{
            con = MyConnectionProvider.getCon();
            ps = con.prepareStatement("select * from customer where username=? and password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                c.setUsername(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setName(rs.getString(3));
            }
        } catch (Exception e){
            System.out.println(e);
        }

        return c;
    }
}
