package Semana2.Actividad2;
import java.util.Scanner;

public class Main {
    static Stack historial = new Stack();
    static Queue tareas = new Queue();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do{
            mostrarMenu();
            opcion = sc.nextInt();
        }   while (opcion != 0);

        System.out.println("Saliendo.");
        sc.close();
    }

    static void mostrarMenu(){
        System.out.println();
        System.out.println("- - - Menu - - -");
        System.out.println("1. Registrar acción");
        System.out.println("2. Deshacer ultima acción");
        System.out.println("3. Ver ultima accion");
        System.out.println("4. Mostrar historial");
        System.out.println("5. Agregar tarea");
        System.out.println("6. Procesar siguiente tarea");
        System.out.println("7. Ver siguiente tarea");
        System.out.println("8. Mostrar tareas pendiente");
        System.out.println("9. Mostrar estado del sistema");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

}