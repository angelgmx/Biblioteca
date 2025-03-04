package Biblioteca;

/**
 * Clase principal para probar el sistema de biblioteca.
 * @author Angel
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell");
        Usuario usuario = new Usuario("Ana", 101);

        if (usuario.tomarPrestado(libro1)) {
            System.out.println("Libro prestado con éxito!");
        }
    }
}
