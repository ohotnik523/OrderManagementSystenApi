package Model;

import java.sql.Date;
import java.util.List;

public class Order {
    private int orderId;
    private List<OrderLine> orderLines;
    private Customer customer;
    private Date submisstionDate;

    public Order (int parOrderId, List<OrderLine> parOrderLines, Customer parCustomer, Date parSubmissionDate){
        orderId =parOrderId;
        orderLines = parOrderLines;
        customer = parCustomer;
        submisstionDate = parSubmissionDate;
    }

    public int GetOrderId(){
        return orderId;
    }
    public List<OrderLine> GetOrderLines(){
        return orderLines;
    }

    public Customer GetCustomer() {
        return customer;
    }
    public Date GetSubmissionDate(){
        return submisstionDate;
    }

    public void SetOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void SetOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public void SetCustomer(Customer customer) {
        this.customer = customer;
    }

    public void SetSubmisstionDate(Date submisstionDate) {
        this.submisstionDate = submisstionDate;
    }
}
