package xyz.d1snin.webservlet.webservlet.repository;

import xyz.d1snin.webservlet.webservlet.model.Product;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProductsRepository {

  private final List<Product> products = new CopyOnWriteArrayList<>();

  public void addProduct(String title, double cost) {
    products.add(new Product(ThreadLocalRandom.current().nextLong(1000000, 9999999), title, cost));
  }

  public List<Product> getProducts() {
    return products;
  }
}
