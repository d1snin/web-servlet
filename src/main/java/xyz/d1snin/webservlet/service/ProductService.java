package xyz.d1snin.webservlet.service;

import xyz.d1snin.webservlet.model.Product;

import java.util.List;

public interface ProductService {

    void addProduct(String title, double cost);

    List<Product> getProducts();

    Product getProductById(long id);
}
