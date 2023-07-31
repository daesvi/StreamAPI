package Practica2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Arroz", 30.5, "Alimentos", 50));
        productos.add(new Producto("Leche", 20.0, "Alimentos", 0));
        productos.add(new Producto("Laptop", 1500.0, "Electrónicos", 10));
        productos.add(new Producto("TV", 800.0, "Electrónicos", 5));
        productos.add(new Producto("Mesa", 120.0, "Hogar", 15));

        // Primer filter, se evalua que el stock sea mayor que cero, y que el precio sea menor que 50
        List<Producto> filterStockYPrecio = productos.stream()
                .filter(producto -> producto.getStock() > 0 && producto.getPrecio() < 50)
                .toList();

        // Segundo filter, se filtran los productos pertenecientes a la categoría alimentos
        List<Producto> filterCategoria = productos.stream()
                .filter(producto -> producto.getCategoria().equals("Alimentos"))
                .toList();

        // Se obtiene el precio total de todos los productos
        double precioTotal = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();

        // Salida con toString para filterStockYPrecio
        System.out.println("Productos con stock mayor que 0 y precio menor que 50:");
        for (Producto producto: filterStockYPrecio){
            System.out.println(producto.toString());
        }

        // Salida filterCategoria, con el nombre de los productos
        System.out.println("\nNombre de productos pertenecientes a la categoría alimentos:");
        for (Producto producto: filterCategoria){
            System.out.println(producto.getNombre());
        }

        // Salida con el precio total de los productos
        System.out.println("\nPrecio total de los productos");
        System.out.println(precioTotal);
    }
}
