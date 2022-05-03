import java.util.LinkedList;
import java.util.Queue;

public class Right_View {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Right View Using Queue :- O(N). */
    public static void rightView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            // number of nodes at current level
            int n = q.size();

            // Traverse all nodes of current level
            for (int i = 0; i < n; i++) {
                Node temp = q.poll();

                // Print the right most element at the level.
                if (i == n - 1)
                    System.out.print(temp.data + " ");

                // Add left node to queue
                if (temp.left != null)
                    q.add(temp.left);

                // Add right node to queue
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        rightView(root);
    }
}
