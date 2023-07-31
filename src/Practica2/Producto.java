package Practica2;

public class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private String categoria;
    private int stock;

    // Constructor

    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Getter
    public String getNombre() {return nombre;}
    public double getPrecio() {return precio;}
    public String getCategoria() {return categoria;}
    public int getStock() {return stock;}

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", stock=" + stock +
                '}';
    }
}
