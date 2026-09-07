public class binarytree {
    static class Node{
        int data;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        Node root= new Node();
        root.data = 1;

        root.left = new Node();
        root.left.data = 2;

        root.left.left = new Node();
        root.left.left.data = 3;

        root.left.left.left = new Node();
        root.left.left.left.data = 4;

        root.left.right = new Node();
        root.left.right.data = 5;

        root.left.right.left = new Node();
        root.left.right.left.data = 6;

        root.left.right.right = new Node();
        root.left.right.right.data = 7;

        root.right = new Node();
        root.right.data = 8;
        
        root.right.left = new Node();
        root.right.left.data = 9;

        root.right.left.left = new Node();
        root.right.left.left.data = 11;

        root.right.right = new Node();
        root.right.right.data = 10;
    }
}
