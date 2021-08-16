package xyz.d1snin.webservlet.service;

import xyz.d1snin.webservlet.model.Cart;

public interface CartService {

  void addProduct(long productId);

  void removeProduct(long productId);

  Cart getCart();
}
