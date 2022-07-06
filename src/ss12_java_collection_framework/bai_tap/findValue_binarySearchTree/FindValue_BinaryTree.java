package ss12_java_collection_framework.bai_tap.findValue_binarySearchTree;

import java.util.Scanner;

public class FindValue_BinaryTree<T> {
    public class Node<T> {
        Comparable<T> info;
        Node<T> left, right;

        public Node(Comparable<T> i) {
            this.info = i;
            this.left = null;
            this.right = null;
        }

        public Node(Comparable<T> i, Node<T> left, Node<T> right) {
            this.info = i;
            this.left = left;
            this.right = right;
        }

    }

    private Node root = null;
    private String s = "";

    private Node<T> add(Node<T> r, Comparable<T> e) {
        if (r == null) {
            r = new Node<T>(e);
            return r;
        }
        if (e.compareTo((T) r.info) == 0) {
            System.out.println(e + "is exist");
            return r;
        }
        if (e.compareTo((T) r.info) < 0) {
            r.left = add(r.left, e);
            return r;
        }
        r.right = add(r.right, e);
        return r;
    }

    public void add(Comparable<T> x) {
        root = add(root, x);
    }

    private boolean findValue(Node<T> r, Comparable<T> x) {
        if (r == null)
            return false;
        if (r != null) {
            if (x.compareTo((T) r.info) == 0) {
                return true;
            }
            if (x.compareTo((T) r.info) < 0) {
                return findValue(r.left, x);
            } else {
                return findValue(r.right, x);
            }
        }
        return true;
    }

    public boolean findValue(Comparable<T> x) {
        return findValue(root, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindValue_BinaryTree<Integer> bst = new FindValue_BinaryTree<Integer>();
        bst.add(7);
        bst.add(6);
        bst.add(15);
        bst.add(-8);
        System.out.println();

        System.out.println("Enter the value which you want to find in binary search tree: ");
        int value = Integer.parseInt(sc.nextLine());
        if (bst.findValue(value) == true)
            System.out.println("Tìm thấy giá trị " + value + " trong cây nhị phân.");
        else
            System.out.println("Không tìm thấy giá trị");
    }
}
