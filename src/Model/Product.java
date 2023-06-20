package Model;

public class Product {
    private int productId;
    private String name;
    private String skyCode;
    private double price;

    public Product (int parProductId, String parName, String parSkyCode, double parPrice){
        productId = parProductId;
        name = parName;
        skyCode = parSkyCode;
        price = parPrice;
    }

    public int GetProductId() {
        return productId;
    }

    public String GetName() {
        return name;
    }

    public String GetSkyCode() {
        return skyCode;
    }

    public double GetPrice() {
        return price;
    }

    public void SetProductId(int productId) {
        this.productId = productId;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetSkyCode(String skyCode) {
        this.skyCode = skyCode;
    }

    public void SetPrice(double price) {
        this.price = price;
    }
}
