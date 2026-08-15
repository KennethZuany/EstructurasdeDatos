import java.util.Scanner; // Permite entrada de teclado

public class Main {

    public static void main(String[] args) {
        LinkedList library = new LinkedList(); // Lista dinamica "library"
        Scanner scanner = new Scanner(System.in); // Entrada de teclado
        int option; // opcion para menu

        do { // Bucle do while
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Agregar libro al inicio");
            System.out.println("2. Agregar libro al final");
            System.out.println("3. Insertar libro en posición");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Buscar libro por código");
            System.out.println("6. Consultar libro por posición");
            System.out.println("7. Eliminar libro por código");
            System.out.println("8. Eliminar libro por posición");
            System.out.println("9. Mostrar cantidad de libros");
            System.out.println("10. Salir");
            System.out.print("Elige una opción: "); // Print deja cursor final renglon

            option = leerEntero(scanner); // Opcion para menu por teclado

            switch (option) { // Opciones menu
                case 1: { // Insert at Beginning
                    Book book = leerLibro(scanner);
                    library.insertAtBeggining(book);
                    System.out.println("Libro agregado al inicio.");
                    break;
                }

                case 2: { // Insert at End
                    Book book = leerLibro(scanner);
                    library.insertAtEnd(book);
                    System.out.println("Libro agregado al final.");
                    break;
                }

                case 3: { // Insert at
                    System.out.print("Posición: ");
                    int index = leerEntero(scanner);
                    Book book = leerLibro(scanner);
                    library.insertAt(index, book);
                    break;
                }

                case 4: // Display
                    System.out.println("Libros registrados:");
                    library.display();
                    break;

                case 5: { // Search
                    System.out.print("Código a buscar: ");
                    String id = scanner.nextLine();
                    boolean found = library.search(id);
                    System.out.println(found ? "El libro existe." : "El libro no existe.");
                    break;
                }

                case 6: { // Get
                    System.out.print("Posición a consultar: ");
                    int idx = leerEntero(scanner);
                    Book b = library.get(idx);
                    if (b != null) {
                        System.out.println("Libro encontrado: " + b);
                    }
                    break;
                }

                case 7: { // Delete
                    System.out.print("Código a eliminar: ");
                    String id = scanner.nextLine();
                    library.delete(id);
                    break;
                }

                case 8: { // Delete at
                    System.out.print("Posición a eliminar: ");
                    int idx = leerEntero(scanner);
                    library.deleteAt(idx);
                    break;
                }

                case 9: // Size
                    System.out.println("Cantidad de libros: " + library.size());
                    break;

                case 10: // Out
                    System.out.println("Saliendo...");
                    break;

                default: // Entrada invalida
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (option != 10);

        scanner.close(); // Cerrar scanner
    }

    private static Book leerLibro(Scanner scanner) { // Llama a constructor Book
        System.out.print("Código: ");
        String id = scanner.nextLine(); // scanner.nextline() para textos largos
        System.out.print("Título: ");
        String title = scanner.nextLine(); // scanner.nextline() para textos largos
        System.out.print("Autor: ");
        String author = scanner.nextLine(); // scanner.nextline() para textos largos
        return new Book(id, title, author);
    }

    private static int leerEntero(Scanner scanner) { // Confirma entrada correcta de teclado
        while (!scanner.hasNextInt()) { //!scanner.hasNextInt = NO es numero
            System.out.print("Ingresa un número válido: ");
            scanner.next(); // Descarta la entrada
        }
        int value = scanner.nextInt(); // Guarda el valor en variable
        scanner.nextLine();
        return value;
    }
}