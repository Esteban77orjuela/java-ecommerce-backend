package com.cine;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public Product buscarProductoPorNombre(List<Product> catalogo, String nombreBuscado) {
        for (Product product : catalogo) {
            if (product.getName().equalsIgnoreCase(nombreBuscado)) {
                return product;
            }
        }
        return null;
    }

    public void mostrarCatalogo(List<Product> catalogo) {
        System.out.println("=== CATALOGO ===");
        for (Product product : catalogo) {
            System.out.println(product);
        }
    }

    public boolean comprarProducto(Product product, int cantidad) {
        if (product.getStock() >= cantidad) {
            product.setStock(product.getStock() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public Order crearOrden(int orderId, User user, Product product, int cantidad) {
        double total = product.getPrice() * cantidad;
        return new Order(orderId, user, product, cantidad, total, "PENDING");
    }

    public List<Product> obtenerProductosPorEncimaDe(List<Product> catalogo, double precioMinimo) {
        List<Product> resultado = new ArrayList<>();

        for (Product product : catalogo) {
            if(product.getPrice() > precioMinimo) {
                resultado.add(product);
            }
        }
        return resultado;
    }
}