package xyz.d1snin.webservlet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.d1snin.webservlet.model.Product;
import xyz.d1snin.webservlet.repository.impl.ProductRepositoryImpl;
import xyz.d1snin.webservlet.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

  private ProductRepositoryImpl products;

  @Override
  public void addProduct(String title, double cost) {
    products.addProduct(title, cost);
  }

  @Override
  public List<Product> getProducts() {
    return products.getProducts();
  }

  @Override
  public Product getProductById(long id) {
    return products.getProductById(id);
  }

  @Autowired
  private void setProducts(ProductRepositoryImpl products) {
    this.products = products;
  }
}
