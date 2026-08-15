public class LinkedList {
    Node head;

    LinkedList() {
        head = null; // Lista Vacia
    }

    public void insertAtBeggining(Book data) {
        Node newNode = new Node(data); // Nodo
        newNode.next = head; // Siguiente del nuevo nodo se hace puntero
        head = newNode; // Puntero es nuevo nodo
    }

    public void insertAtEnd(Book data) {
        Node newNode = new Node(data); // Nodo

        if (head == null) { // ¿Lista vacia?
            head = newNode; // Nuevo nodo se hace puntero
            return;
        }

        Node current = head; // Lista con nodos
        while (current.next != null) { // Recorre hasta ultimo nodo
            current = current.next; // Se agrega el nuevo nodo
        }
        current.next = newNode; // Nuevo nodo siguiente al actual
    }

    public void insertAt(int index, Book value) {
        if (index < 0) { // Negativo
            System.out.println("Posición inválida: " + index); 
            return; // Rechazo
        }

        if (index == 0 || head == null) { // 0 o lista vacia
            insertAtBeggining(value); // Delegar
            return;
        }

        if (index >= size()) { // Mayor a tamaño
            insertAtEnd(value); // Delegar 
            return;
        }

        Node newNode = new Node(value);
        Node current = head;

        for (int i = 0; i < index - 1; i++) { 
            current = current.next; // Recorres nodo anterior al deseado
        }

        newNode.next = current.next;
        current.next = newNode; // Insertar
    }

    public void display() { 
        if (head == null) { // ¿Lista vacia?
            System.out.println("La biblioteca está vacía.");
            return;
        }

        Node current = head;
        int i = 0; // Contador
        while (current != null) { // Recorre hasta null
            System.out.println(i + " -> " + current.data); // Imprime cada dato
            current = current.next;
            i++;
        }
    }

    public int size() {
        Node current = head;
        int cont = 0; // Contador

        while (current != null) { // Recorre hasta null
            cont++; // Aumenta contador
            current = current.next;
        }
        return cont;
    }

    public boolean search(String id) {
        Node current = head;

        while (current != null) { // Recorre ultimo nodo antes de null
            if (current.data.getId().equals(id)) { // Compara Id 
                return true; // Coincidencia
            }
            current = current.next;
        }
        return false; // Sin coincidencia
    }

    public void delete(String id) {
        if (head == null) { // ¿Lista vacia?
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }

        if (head.data.getId().equals(id)) { // Coincide con puntero
            head = head.next;
            System.out.println("Libro eliminado (era el primero).");
            return;
        }

        Node current = head;
        while (current.next != null) { // Recorre hasta ultimo nodo antes de null
            if (current.next.data.getId().equals(id)) {
                current.next = current.next.next; // Reemplza
                System.out.println("Libro eliminado.");
                return;
            }
            current = current.next;
        }

        System.out.println("Libro con código " + id + " no encontrado."); // Sin coincidencia
    }

    public void deleteAt(int index) {
        if (head == null) { // ¿Lista vacia?
            System.out.println("La lista está vacía.");
            return;
        }

        if (index < 0 || index >= size()) { // Negativo o mayor a tamaño lista
            System.out.println("Posición inválida: " + index);
            return;
        }

        if (index == 0) { // Puntero
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) { // Recorre hasta nodo anterior a deseado
            current = current.next;
        }

        current.next = current.next.next;
    }

    public Book get(int index) {
        if (index < 0 || index >= size()) { // Negativo o mayor a tamaño lista
            System.out.println("Posición inválida: " + index);
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) { // Recorre hasta nodo deaseado
            current = current.next;
        }

        return current.data;
    }
}