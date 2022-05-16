package all_servlet;

public interface CustomerDAO {
    int insertCustomer(Customer c);
    Customer getCustomer(String username, String pass);

}
