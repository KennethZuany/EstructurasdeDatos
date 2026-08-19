public class Colas {
    static class Queue {
        int[] data;
        int front;
        int rear;
        
        Queue(int capacity){
            data = new int[capacity];
            front = 0;
            rear = -1;
        }

        public void enqueue(int value){
            if(rear == data.length - 1){
                System.out.println("Cola vacia");
                return;
            }

            rear ++;
            data[rear] = value;
        }

        public int dequeue(){
            int value = data[front];
            front++;
            return value;
        }

        public int peek(){
            if(front == data.length - 1){
                throw new RuntimeException("Cola vacia");
            }
            return data[front];
        }

        public boolean isEmpty(){
            if(rear == data.length - 1){
                return false;
            }
            return true;
        }

        public int size(){
            
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
