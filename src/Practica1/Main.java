package Practica1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // PRACTICA
//        Dada una lista de palabras, tu objetivo es realizar diferentes operaciones utilizando
//        streams de Java para obtener los siguientes resultados:
//         - Crear un array con 15 palabras de diferente longitud de caracteres.
//         - Filtrar las palabras que contengan exactamente 5 caracteres.
//         - Convertir las palabras filtradas a mayúsculas.
//         - Ordenar las palabras en orden alfabético.

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
