public class Main {
    
    static class Stack{ // Pila
        int[] data; // Datos
        int top; // Top

        public Stack(int capacity){ // Tamaño
            data = new int[capacity];
            top = -1;
        }

        public void push(int value){ // Agregar
            if(top == data.length - 1){
                System.out.println("La pila esta llena");
                return;
            }
            top++;
            data[top] = value;
        }

        public int peek(){ // Mostrar valor top
            if(top == -1){
                // System.out.println("Pila vacia");
                // return 0;
                throw new RuntimeException("Pila vacia");
            }
            return data[top];
        }
        
        public int pop(){ // Eliminar valor top
            if(top == -1){ // ¿Pila vacia?
                throw new RuntimeException("Pila vacia");
            }
            int value = data[top];
            top--;
            return value;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public int size(){
            return top + 1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        System.out.println(stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());
    }
}
