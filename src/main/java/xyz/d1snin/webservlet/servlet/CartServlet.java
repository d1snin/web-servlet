package xyz.d1snin.webservlet.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.d1snin.webservlet.service.CartService;

import java.io.IOException;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

  private CartService cartService;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.getWriter().println(cartService.getCart(request.getSession()).getProducts());
  }

  @Autowired
  private void setCartService(CartService cartService) {
    this.cartService = cartService;
  }
}
