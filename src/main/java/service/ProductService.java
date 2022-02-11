package service;

import model.Product;

import java.io.IOException;
import java.util.Map;

public interface ProductService {
    Response<Product> getProduct(String name);

    Response<Map<String, Product>> getAllProducts() throws IOException, ClassNotFoundException;

    Response<Product> addProduct(Product product) throws IOException;

    Response<Product> deleteProduct(String name);

    Response<Product> changeProductName(String name, String newName);

    Response<Product> changeProductQuantity(String name, int quantity);

    Response<Product> changeProductPrice(String name, double price);
}