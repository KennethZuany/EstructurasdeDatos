package Semana2.Actividad2;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

  public void enqueue(String data){
    Node newNode = new Node(data);

    if (front == null){
      front = newNode;
      rear = newNode;
      return;
    }

    rear.next = newNode;
    rear = newNode;
  }

  public String dequeue(){
    if(front == null){
      throw new RuntimeException("La cola esta vacia");
    }
    String value = front.data;
    front = front.next;
    if(front == null){
      rear = null;
    }
    return value;
  }

  public String peek(){
    if(front == null){
      throw new RuntimeException("La cola esta vacia");
    }
    return front.data;
  }

  public boolean isEmpty(){
    return front == null;
  }

  public int size(){
    int cont = 0;
    Node current = front;
    while(current != null){
      cont++;
      current = current.next;
    }
    return cont;
  }

  public void display() {
    if (front == null) {
      System.out.println("(no hay tareas pendientes)");
      return;
    }
    Node current = front;
    System.out.println("FRONT");
    System.out.println("  |");
    while (current != null) {
      System.out.println(current.data);
      if (current.next != null) {
        System.out.println("  |");
      }
      current = current.next;
    }
    System.out.println("  |");
    System.out.println("REAR");
  }
}