package xyz.d1snin.webservlet.repository.impl;

import org.springframework.stereotype.Repository;
import xyz.d1snin.webservlet.model.Product;
import xyz.d1snin.webservlet.repository.ProductRepository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

  private final List<Product> products = new CopyOnWriteArrayList<>();


  public void addProduct(String title, double cost) {
    products.add(new Product(ThreadLocalRandom.current().nextLong(1000000, 9999999), title, cost));
  }

  public List<Product> getProducts() {
    return products;
  }

  @Override
  public Product getProductById(long id) {
    return products.stream().filter(it -> it.getId() == id).findFirst().orElse(null);
  }
}
