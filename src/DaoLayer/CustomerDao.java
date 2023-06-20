package DaoLayer;

import Model.Customer;

import java.sql.*;


public class CustomerDao {
    private Connection connection;

    public CustomerDao(Connection parConnection){
        connection =parConnection;
    }
    public void CreateCustomer(Customer customer) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Customers (customerId, registationCode, fullName, email, telephone) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, customer.GetCustomerId());
        statement.setString(2, customer.GetRegistationCode());
        statement.setString(3, customer.GetFullName());
        statement.setString(4, customer.GetEmail());
        statement.setString(5, customer.GetTelephone());
        statement.executeUpdate();

    }
    public void UpdateCustomer(Customer customer) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE Customers SET customerId = ?, registationCode = ?, fullName = ?, email = ?, telephone = ?>", Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, customer.GetCustomerId());
        statement.setString(2, customer.GetRegistationCode());
        statement.setString(3, customer.GetFullName());
        statement.setString(4, customer.GetEmail());
        statement.setString(5, customer.GetTelephone());
        statement.executeUpdate();

    }
}
