package xyz.d1snin.webservlet.service.impl;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.d1snin.webservlet.model.Cart;
import xyz.d1snin.webservlet.service.CartService;
import xyz.d1snin.webservlet.service.ProductService;

import java.util.ArrayList;

@Service
public class CartServiceImpl implements CartService {

  private ProductService productService;

  @Override
  public void addProduct(long productId, HttpSession session) {
    Cart cart = getCartSafe(session);
    cart.getProducts().add(productService.getProductById(productId));
    session.setAttribute("cart", cart);
  }

  @Override
  public void removeProduct(long productId, HttpSession session) {
    Cart cart = getCartSafe(session);
    cart.getProducts().remove(productService.getProductById(productId));
    session.setAttribute("cart", cart);
  }

  @Override
  public Cart getCart(HttpSession session) {
    return getCartSafe(session);
  }

  @Autowired
  private void setProductService(ProductService productService) {
    this.productService = productService;
  }

  private Cart getCartSafe(HttpSession session) {
    if (session.getAttribute("cart") == null) {
      Cart newCart = new Cart(new ArrayList<>());
      session.setAttribute("cart", newCart);
      return newCart;
    }

    return (Cart) session.getAttribute("cart");
  }
}
