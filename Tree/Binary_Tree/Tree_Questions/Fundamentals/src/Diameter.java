public class Diameter {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Diameter Of A Binary Tree - O(N^2). */
    public static int diameterOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        int h1 = maxDepth(root.left);
        int h2 = maxDepth(root.right);

        int op1 = h1 + h2;
        int op2 = diameterOfBinaryTree(root.left);
        int op3 = diameterOfBinaryTree(root.right);

        return (Math.max(op1, Math.max(op2, op3)));
    }

    private static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(diameterOfBinaryTree(root));
    }
}
