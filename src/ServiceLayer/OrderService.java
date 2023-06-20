package ServiceLayer;

import DaoLayer.OrderDao;
import Model.Order;

import java.sql.Date;
import java.util.List;

public class OrderService {
    private OrderDao orderDao;
    public OrderService (OrderDao parOrderDao){
        orderDao = parOrderDao;
    }

    public void createOrder(Order order){
        orderDao.CreateOrder(order);
    }
    public List<Order> SearchOrdersBydate(Date date){
        return SearchOrdersBydate(date);
    }
}
