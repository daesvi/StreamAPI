package Practica1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista con 15 palabras de distinta longitud
        List<String> words = Arrays.asList(
                "casa",
                "perro",
                "libro",
                "naranja",
                "mesa",
                "gato",
                "manzana",
                "coche",
                "silla",
                "ordenador",
                "sol",
                "ventana",
                "arbol",
                "telefono",
                "television"
        );

        List<String> wordsFiltered = words.stream()
                .filter(x -> x.length() == 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println(wordsFiltered);
    }
}
