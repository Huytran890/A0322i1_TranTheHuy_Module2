package ss12_java_collection_framework.bai_tap.delete_binarySearchTree;

public class Delete_Node_BinaryTree<T> {
    public class Node<T> {
        Comparable<T> data;
        Node<T> left, right;

        public Node(Comparable<T> data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Node(Comparable<T> data, Node<T> left, Node<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    private Node root = null;
    private String s = "";

    public void add() {
        Node r7 = new Node(11);
        Node r6 = new Node(6);
        Node r4 = new Node(4, r6, null);
        Node r5 = new Node(71, r7, null);
        Node r3 = new Node(8);
        Node r2 = new Node(7, r4, r5);
        Node r1 = new Node(1, r3, null);
        root = new Node(3, r1, r2);
    }


    private int minValue(Node<T> r) {
        while (r.left != null)
            r = r.left;

        return (Integer) (r.data);
    }

    public int minValue() {
        return minValue(root);
    }

    private void deleteValue(Comparable<T> data) {
        root = deleteNode(root, data);
    }

    public Node deleteNode(Node<T> root, Comparable<T> x) {
        if (root == null) return root;

        if (x.compareTo((T) root.data) < 0)
            root.left = deleteNode(root.left, x);
        else if (x.compareTo((T) root.data) > 0)
            root.right = deleteNode(root.right, x);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data.equals(minValue(root.right));

            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    public static void main(String[] args) {
        Delete_Node_BinaryTree<Integer> binaryTree = new Delete_Node_BinaryTree<>();
        binaryTree.add();
        System.out.println();
    }

}
