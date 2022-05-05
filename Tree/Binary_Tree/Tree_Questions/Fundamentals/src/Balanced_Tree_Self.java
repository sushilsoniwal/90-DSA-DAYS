public class Balanced_Tree_Self {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static boolean flag;

    public static boolean isBalanced(Node root) {
        flag = false;
        height(root);
        if (flag == true) {
            return false;
        }
        return true;
    }

    public static int height(Node root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) > 1) {
            flag = true;
        }
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        System.out.println(isBalanced(root));
    }
}
