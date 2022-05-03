// https://practice.geeksforgeeks.org/problems/sum-tree/1#

public class Sum_Tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Sum Tree :- O(N^2). */
    public static boolean isSumTree(Node root) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;

        int left = NodeSum(root.left);
        int right = NodeSum(root.right);

        if (left + right != root.data) {
            return false;
        }

        return (isSumTree(root.left) && isSumTree(root.right));
    }

    private static int NodeSum(Node root) {
        if (root == null)
            return 0;

        return NodeSum(root.left) + NodeSum(root.right) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(isSumTree(root));
    }
}
