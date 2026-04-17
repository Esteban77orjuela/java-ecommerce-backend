package com.cine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product laptop = new Product(1, "Laptop HP", 999.99, 50);
        Product mouse = new Product(2, "Mouse Gamer", 29.99, 200);
        Product teclado = new Product(3, "Teclado RGB", 59.99, 150);

        User esteban = new User(1, "Esteban", "est@gmail.com", "123", "CUSTOMER");

        List<Product> catalogo = new ArrayList<>();
        catalogo.add(laptop);
        catalogo.add(mouse);
        catalogo.add(teclado);

        ProductService productService = new ProductService();

        productService.mostrarCatalogo(catalogo);

        System.out.println("\n=== COMPRA ===");

        int cantidad = 2;
        boolean compraExitosa = productService.comprarProducto(laptop, cantidad);

        if (compraExitosa) {
            Order orden = productService.crearOrden(1, esteban, laptop, cantidad);

            System.out.println("Compra realizada con éxito");
            System.out.println("Stock actual de laptop: " + laptop.getStock());
            System.out.println("Orden creada:");
            System.out.println(orden);
        } else {
            System.out.println("No hay stock suficiente");
        }

        System.out.println("\n=== PRODUCTOS CAROS (>50) ===");
        List<Product> productosCaros = productService.obtenerProductosPorEncimaDe(catalogo, 50);

        for (Product product : productosCaros) {
            System.out.println(product);
        }
    }
}