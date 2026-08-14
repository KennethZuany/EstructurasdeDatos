public class Main {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        Node first = new Node(5);
        Node second = new Node(12);
        Node third = new Node(8);
        Node fourth = new Node(21);
        Node fifth = new Node(30);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node current = first;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(first.next.next.data);
        System.out.println(first.next.next.next.data);
    }
}