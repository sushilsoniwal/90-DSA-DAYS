public class Floor_BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Floor:- Gretest Value <= Key { T.C = O(logn) }; */
    public static int findFloor(Node root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.data == key) {
                floor = root.data;
                return floor;
            } else if (root.data < key) {
                root = root.right;
            } else {
                floor = root.data;
                root = root.left;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.right = new Node(87);
        root.right.left.right = new Node(66);
        root.right.right.right = new Node(90);
        root.right.left.right.left = new Node(45);

        System.out.println(findFloor(root, 83));
    }
}
