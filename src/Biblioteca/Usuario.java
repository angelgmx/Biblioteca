package Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario de la biblioteca.
 * @author TuNombre
 * @version 1.0
 * @since 1.0
 */
public class Usuario {
    private String nombre;
    private int id;
    private List<Libro> librosPrestados;

    /**
     * Constructor para crear un usuario.
     * @param nombre Nombre del usuario.
     * @param id Identificador único.
     */
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Permite al usuario tomar prestado un libro.
     * @param libro Libro a prestar.
     * @return `true` si el préstamo fue exitoso, `false` en caso contrario.
     */
    public boolean tomarPrestado(Libro libro) {
        if (libro.prestar()) {
            librosPrestados.add(libro);
            return true;
        }
        return false;
    }

    /**
     * Devuelve un libro a la biblioteca.
     * @param libro Libro a devolver.
     */
    public void devolverLibro(Libro libro) {
        libro.devolver();
        librosPrestados.remove(libro);
    }
}
