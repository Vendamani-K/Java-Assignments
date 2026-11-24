package DataStructures.MaximumPathSumAssignment;

public class Main {

    public static void main(String[] args) {

        // Create the binary tree
        Node root = new Node(10);

        root.left = new Node(2);
        root.right = new Node(10);

        root.left.left = new Node(20);
        root.left.right = new Node(1);

        root.right.left = new Node(-25);
        root.right.right = new Node(3);

        // Find maximum path sum
        BinaryTree tree = new BinaryTree();

        int result = tree.maxPathSum(root);

        System.out.println("Maximum Path Sum: " + result);
    }
}
