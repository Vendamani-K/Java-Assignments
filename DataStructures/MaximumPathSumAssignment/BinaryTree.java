package DataStructures.MaximumPathSumAssignment;



public class BinaryTree {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(Node root) {

        if (root == null) {
            return 0;
        }

        maxSum = Integer.MIN_VALUE;

        calculateMaxPath(root);

        return maxSum;
    }

    private int calculateMaxPath(Node root) {

        // Base condition
        if (root == null) {
            return 0;
        }

        // Find maximum sum from left subtree
        int leftSum = Math.max(0, calculateMaxPath(root.left));

        // Find maximum sum from right subtree
        int rightSum = Math.max(0, calculateMaxPath(root.right));

        // Maximum path passing through current Node
        int currentSum = root.data + leftSum + rightSum;

        // Update maximum path sum
        maxSum = Math.max(maxSum, currentSum);

        // Return maximum one-sided path to parent
        return root.data + Math.max(leftSum, rightSum);
    }
}
