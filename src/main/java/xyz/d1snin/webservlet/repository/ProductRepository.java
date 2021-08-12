package xyz.d1snin.webservlet.repository;

import xyz.d1snin.webservlet.model.Product;

import java.util.List;

public interface ProductRepository {

  void addProduct(String title, double cost);

  List<Product> getProducts();

  Product getProductById(long id);
}
