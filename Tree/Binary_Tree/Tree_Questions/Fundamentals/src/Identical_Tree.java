public class Identical_Tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isIdentical(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null && r2 != null) {
            return false;
        }
        if (r1 != null && r2 == null) {
            return false;
        }
        boolean left = isIdentical(r1.left, r2.left);
        boolean right = isIdentical(r1.right, r2.right);

        boolean value = r1.data == r2.data;

        if (left && right && value) {
            return true;
        } else {
            return false;
        }

//        return ((r1.data == r2.data) && isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right));
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.left.left = new Node(8);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.left.left.left = new Node(8);

        System.out.println(isIdentical(root1, root2));
    }
}
