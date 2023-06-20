package DaoLayer;
import Model.Customer;
import Model.Order;
import Model.OrderLine;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class OrderDao {
    private Connection connection;

    public  OrderDao(Connection parConnection){
        connection = parConnection;
    }
    public void CreateOrder(Order order) throws SQLException{

        PreparedStatement statement = connection.prepareStatement("INSERT INTO Orders (orderId, submisstionDate) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, order.GetOrderId());
        statement.setDate(2, order.GetSubmissionDate());
        statement.executeUpdate();
    }


    Public list<Order> Object SearchOrdersByDate(Date date) throws SQLException {
        List<Order> order = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM Orders WHERE topic = ?");
        statement.setDate(1, order.GetSubmissionDate());
        ResultSet resultSet = statement.executeQuery();

        return order;

    }
}
