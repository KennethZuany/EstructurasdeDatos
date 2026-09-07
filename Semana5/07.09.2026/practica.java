public class practica {
    static class Node{
        int data;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        Node root= new Node();
        root.data = 50;

        root.left = new Node(); 
        root.left.data = 30;

        root.right = new Node();
        root.right.data = 80;

        root.left.left = new Node();
        root.left.left.data = 20;

        root.left.right = new Node();
        root.left.right.data = 40;

        root.right.left = new Node();
        root.right.left.data = 70;

        root.right.right = new Node();
        root.right.right.data = 90;

        System.out.println("Valor de la raiz: " + root.data);
    }
}
