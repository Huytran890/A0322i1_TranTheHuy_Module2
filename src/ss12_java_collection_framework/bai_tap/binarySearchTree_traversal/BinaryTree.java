package ss12_java_collection_framework.bai_tap.binarySearchTree_traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T> {
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

    private Node<T> add(Node<T> r, Comparable<T> e) {
        if (r == null) {
            r = new Node<T>(e);
            return r;
        }
        if (e.compareTo((T) r.data) == 0) {
            System.out.println(e + "is exist");
            return r;
        }
        if (e.compareTo((T) r.data) < 0) {
            r.left = add(r.left, e);
            return r;
        }
        r.right = add(r.right, e);
        return r;
    }

    public void add(Comparable<T> x) {
        root = add(root, x);
    }

    private void inOrder(Node<T> r) {
        if (r != null) {
            System.out.println(r.data + "");
            inOrder(r.left);
            inOrder(r.right);
        }
    }

    public void inOder() {
        inOrder(root);
    }

    private void midOrder(Node<T> r) {
        if (r != null) {
            midOrder(r.left);
            System.out.println(r.data + "");
            midOrder(r.right);
        }
    }

    public void midOrder() {
        midOrder(root);
    }

    private void postOrder(Node<T> r) {
        if (r != null) {
            postOrder(r.left);
            postOrder(r.right);
            System.out.println(r.data + "");
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    public void duyetChieuSau() {
        Stack<Node> s = new Stack();
        s.push(root);
        while (!s.empty()) {
            Node<T> r = s.pop();
            System.out.println(r.data);
            if (r.right != null)
                s.push(r.right);
            if (r.left != null)
                s.push(r.left);
        }
    }

    public void duyetChieuRong() {
        Queue<Node> s = new LinkedList<>();
        s.add(root);
        while (!s.isEmpty()) {
            Node<T> r = s.remove();
            System.out.println(r.data);
            if (r.left != null)
                s.add(r.left);
            if (r.right != null)
                s.add(r.right);
        }
    }

    private int heightOfTree(Node<T> r) {
        if (r == null)
            return 0;
        return 1 + Math.max(heightOfTree(r.left), heightOfTree(r.right));
    }

    public int heightOfTree() {
        return heightOfTree(root);
    }

    private boolean isBST(Node<T> r) {
        if (r == null)
            return true;
        if (r.left != null && (Integer) r.left.data > (Integer) r.data)
            return false;
        if (r.right != null && (Integer) r.right.data < (Integer) r.data)
            return false;
        if (!isBST(r.left) || !isBST(r.right))
            return false;
        return true;
    }

    public boolean isBST() {
        return isBST(root);
    }

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.add();
        binaryTree.inOder();
        System.out.println();
//        binaryTree.midOrder();
//        System.out.println();
//        binaryTree.postOrder();
//        System.out.println();
//		binaryTree.duyetChieuSau();
//		System.out.println();
//		binaryTree.duyetChieuRong();
    }
}