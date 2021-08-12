package xyz.d1snin.webservlet.model;

import lombok.Data;

import java.util.List;

@Data
public class Cart {
    private final List<Product> products;
}
