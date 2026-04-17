package com.cine;

public class Product {

    // Atributos (las características del producto)
    private int id;
    private String name;
    private double price;
    private int stock;

    // Constructor (cómo se CREA un producto)
    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters (para LEER los datos)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setter (para MODIFICAR el stock)
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}

/*
📌 MEMORIZA:

  private  = NADIE puede tocar esto desde afuera
  getter   = "déjame VER el dato" (solo lectura)
  setter   = "déjame CAMBIAR el dato" (escritura)
  this     = "me refiero a MÍ MISMO"

Analogía:
  private = tu dinero en la caja fuerte 🔒
  getter  = ver cuánto tienes por la ventanilla
  setter  = depositar o retirar por la ventanilla

  NADIE mete la mano directamente a tu caja fuerte.
  Todo pasa por la ventanilla (getter/setter).

🛡️ CIBERSEGURIDAD:
  Esto se llama ENCAPSULAMIENTO.
  Es el mismo principio de "menor privilegio".
  Solo expones lo NECESARIO.
*/