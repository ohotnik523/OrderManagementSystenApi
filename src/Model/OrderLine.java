package Model;

public class OrderLine {
    private int orderLineId;
    private Product product;
    private int quantity;

    public OrderLine (int parOrderLineId, Product parProduct, int parQuantity){
        orderLineId = parOrderLineId;
        product = parProduct;
        quantity =parQuantity;
    }

    public int GetOrderLineId() {
        return orderLineId;
    }

    public Product GetProduct() {
        return product;
    }

    public int GetQuantity() {
        return quantity;
    }

    public void SetOrderLineId(int orderLineId) {
        this.orderLineId = orderLineId;
    }

    public void SetProduct(Product product) {
        this.product = product;
    }

    public void SetQuantity(int quantity) {
        this.quantity = quantity;
    }
}
