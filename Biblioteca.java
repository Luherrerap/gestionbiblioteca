import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        inventario.add(libro);
        System.out.println("Libro agregado con éxito.");
    }

    public void mostrarLibros() {
        if (inventario.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : inventario) {
                System.out.println(libro);
            }
        }
    }

    public void eliminarLibro(String isbn) {
        inventario.removeIf(libro -> libro.getIsbn().equals(isbn));
        System.out.println("Libro eliminado del inventario.");
    }
}
