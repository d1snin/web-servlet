package xyz.d1snin.webservlet.service;

import jakarta.servlet.http.HttpSession;
import xyz.d1snin.webservlet.model.Cart;

public interface CartService {

  void addProduct(long productId, HttpSession session);

  void removeProduct(long productId, HttpSession session);

  Cart getCart(HttpSession session);
}
