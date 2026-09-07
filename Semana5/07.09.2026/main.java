public class main {
    
    static class Node{
        int data;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        Node root= new Node();
        root.data = 10;

        root.left = new Node(); 
        root.left.data = 5;

        root.right = new Node();
        root.right.data = 20;

        root.left.left = new Node();
        root.left.left.data = 3;

        root.left.right = new Node();
        root.left.right.data = 7;

        System.out.println("Valor de la raiz: " + root.data);
    }
}
