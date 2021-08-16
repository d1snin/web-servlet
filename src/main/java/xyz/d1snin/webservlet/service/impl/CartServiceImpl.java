package xyz.d1snin.webservlet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.d1snin.webservlet.model.Cart;
import xyz.d1snin.webservlet.service.CartService;
import xyz.d1snin.webservlet.service.ProductService;

import java.util.ArrayList;

@Service("cartService")
public class CartServiceImpl implements CartService {

  private ProductService productService;
  private final Cart cart;

  public CartServiceImpl() {
    this.cart = new Cart(new ArrayList<>());
  }

  @Override
  public void addProduct(long productId) {
    cart.getProducts().add(productService.getProductById(productId));
  }

  @Override
  public void removeProduct(long productId) {
    cart.getProducts().remove(productService.getProductById(productId));
  }

  @Override
  public Cart getCart() {
    return cart;
  }

  @Autowired
  private void setProductService(ProductService productService) {
    this.productService = productService;
  }
}
