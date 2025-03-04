package Biblioteca;


/**
 * Representa un libro en la biblioteca.
 * @author TuNombre
 * @version 1.0
 * @since 1.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    /**
     * Constructor para crear un libro.
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    /**
     * Indica si el libro está disponible para préstamo.
     * @return `true` si está disponible, `false` en caso contrario.
     */
    public boolean estaDisponible() {
        return disponible;
    }

    /**
     * Marca el libro como prestado.
     * @deprecated Usar {@link #prestar()} en su lugar.
     */
    @Deprecated
    public void prestarLibro() {
        prestar();
    }

    /**
     * Realiza el préstamo del libro.
     * @return `true` si el préstamo fue exitoso, `false` si ya estaba prestado.
     * @since 1.1
     */
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    /**
     * Devuelve el libro a la biblioteca.
     */
    public void devolver() {
        disponible = true;
    }
}
