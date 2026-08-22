package Semana2.Actividad2;

public class PruebaEstructuras {
 
    public static void main(String[] args) {
        pruebasStack();
        System.out.println();
        pruebasQueue();
        System.out.println();
        pruebaComportamiento();
    }
 
    static void pruebasStack() {
        System.out.println("===== PRUEBAS DE STACK (LIFO) =====");
        Stack stack = new Stack();
 
        System.out.println("stack vacia? " + stack.isEmpty());
 
        stack.push("Crear archivo");
        stack.push("Editar archivo");
        stack.push("Renombrar archivo");
        System.out.println("push: Crear archivo, Editar archivo, Renombrar archivo");
 
        System.out.println("peek (tope actual): " + stack.peek());
 
        System.out.println("pop: " + stack.pop());
        System.out.println("peek despues del pop: " + stack.peek());
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
 
        System.out.println("--- Probando Stack vacia ---");
        Stack stackVacia = new Stack();
        System.out.println("isEmpty: " + stackVacia.isEmpty());
        try {
            stackVacia.pop();
        } catch (RuntimeException e) {
            System.out.println("pop() controlado: " + e.getMessage());
        }
        try {
            stackVacia.peek();
        } catch (RuntimeException e) {
            System.out.println("peek() controlado: " + e.getMessage());
        }
    }
 
    static void pruebasQueue() {
        System.out.println("===== PRUEBAS DE QUEUE (FIFO) =====");
        Queue cola = new Queue();
 
        System.out.println("Cola vacia? " + cola.isEmpty());
 
        cola.enqueue("Tarea 1");
        cola.enqueue("Tarea 2");
        cola.enqueue("Tarea 3");
        System.out.println("enqueue: Tarea 1, Tarea 2, Tarea 3");
 
        System.out.println("peek (frente actual): " + cola.peek());
 
        System.out.println("dequeue: " + cola.dequeue());
        System.out.println("peek despues del dequeue: " + cola.peek());
        System.out.println("size: " + cola.size());
        System.out.println("isEmpty: " + cola.isEmpty());
 
        System.out.println("--- Probando Queue vacia ---");
        Queue colaVacia = new Queue();
        System.out.println("isEmpty: " + colaVacia.isEmpty());
        try {
            colaVacia.dequeue();
        } catch (RuntimeException e) {
            System.out.println("dequeue() controlado: " + e.getMessage());
        }
        try {
            colaVacia.peek();
        } catch (RuntimeException e) {
            System.out.println("peek() controlado: " + e.getMessage());
        }
    }
 
    static void pruebaComportamiento() {
        System.out.println("===== STACK vs QUEUE: A, B, C, D =====");
 
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
 
        System.out.print("Stack  -> orden de salida (LIFO): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
 
        Queue cola = new Queue();
        cola.enqueue("A");
        cola.enqueue("B");
        cola.enqueue("C");
        cola.enqueue("D");
 
        System.out.print("Queue  -> orden de salida (FIFO): ");
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
        System.out.println();
    }
}