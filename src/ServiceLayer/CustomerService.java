package ServiceLayer;

import DaoLayer.CustomerDao;
import Model.Customer;

public class CustomerService {
    private CustomerDao customerDao;

    public CustomerService(CustomerDao parCustomerDao){
        customerDao =parCustomerDao;
    }
    public void createCustomer(Customer customer) {
        customerDao.CreateCustomer(customer);
    }
}
