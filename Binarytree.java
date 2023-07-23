class Node {
    int data;;
    Node left, right;

    // parameterized constructor
    public Node(int item) {
        data = item;
        left = right = null;
    } // constructor ends
} // class ends

class Binarytree {
    Node root;

    int level(Node node) {
        if (node == null)
            return 0;
        return node.data - level(node.left) - level(node.right);
    }

    // main function
    public static void main(String args[]) {
        Binarytree tree = new Binarytree();
        // creating Binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        int leveldiff = tree.level(tree.root);
        System.out.println("Difference between sum of odd & even level nodes is " + leveldiff);
    }
}