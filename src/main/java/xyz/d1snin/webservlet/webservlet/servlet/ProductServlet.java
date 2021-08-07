package xyz.d1snin.webservlet.webservlet.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import xyz.d1snin.webservlet.webservlet.repository.ProductsRepository;

import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

  private ProductsRepository products;
  private Gson gson;

  @Override
  public void init() {
    products = new ProductsRepository();
    gson = new GsonBuilder().setPrettyPrinting().create();

    products.addProduct("Product1", 125.34);
    products.addProduct("Product2", 124.32);
    products.addProduct("Product3", 1278.30);
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    response.setContentType("application/json");

    response.getWriter().println(gson.toJson(products.getProducts()));
  }
}
