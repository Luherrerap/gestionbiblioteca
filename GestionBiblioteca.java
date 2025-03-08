import java.util.Scanner;

public class GestionBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Biblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese ISBN: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    System.out.print("Ingrese ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(isbnEliminar);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }

}
