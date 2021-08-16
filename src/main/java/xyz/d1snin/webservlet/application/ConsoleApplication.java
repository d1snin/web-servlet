package xyz.d1snin.webservlet.application;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.d1snin.webservlet.configuration.ApplicationConfiguration;
import xyz.d1snin.webservlet.service.CartService;

import java.util.Scanner;

@CommonsLog
public class ConsoleApplication {
  public static void main(String[] args) {
    CartService cartService =
        new AnnotationConfigApplicationContext(ApplicationConfiguration.class)
            .getBean("cartService", CartService.class);

    Scanner scanner = new Scanner(System.in);

    while (true) {

      String op = scanner.nextLine();
      String[] arguments = op.split("\\s+");

      if (op.startsWith("remove")) {
        if (arguments.length < 2) {
          log.error("No id provided.");
          return;
        }

        cartService.removeProduct(Long.parseLong(arguments[1]));

      } else if (op.startsWith("add")) {
        if (arguments.length < 2) {
          log.error("No id provided.");
          return;
        }

        cartService.addProduct(Long.parseLong(arguments[1]));

      } else if (op.startsWith("all")) {
        log.info(cartService.getCart().getProducts());
      }
    }
  }
}
