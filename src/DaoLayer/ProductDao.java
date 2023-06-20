package DaoLayer;

import Model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 private int productId;
    private String name;
    private String skyCode;
    private double price;
 */
public class ProductDao {
    private Connection connection;
    public ProductDao (Connection parConnection){
        connection = parConnection;
    }
    public void CreateProduct(Product product) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO Products (productId, name, skyCode, price) VALUES (?, ?, ?,?,?)", Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, product.GetProductId());
        statement.setString(2, product.GetName());
        statement.setString(3, product.GetSkyCode());
        statement.setDouble(4, product.GetPrice());
        statement.executeUpdate();

    }
}
