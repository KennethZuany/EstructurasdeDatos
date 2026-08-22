package Semana2.Actividad2;

public class Stack {
    private Node top;

    public Stack(){
        top = null;
    }

    public void push(String data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public String pop(){
        if(top == null){
            throw new RuntimeException("La pila esta vacia");
        }

        String value = top.data;
        top = top.next;
        return value;
    }

    public String peek(){
        if(top == null){
            throw new RuntimeException("La pila esta vacia");
        }

        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        int cont = 0;
        Node current = top;
        while(current != null){
            cont++;
            current = current.next;
        }

        return cont;
    }

    public void display(){
        if(top == null){
            throw new RuntimeException("La pila esta vacia");
        }

        Node current = top;
        System.out.println("- - - Top - - -");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("- - - - - - - -");
    }
}

