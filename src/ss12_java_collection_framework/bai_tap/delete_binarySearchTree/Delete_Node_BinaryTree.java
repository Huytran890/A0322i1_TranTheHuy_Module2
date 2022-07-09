package ss12_java_collection_framework.bai_tap.delete_binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class Delete_Node_BinaryTree<E> {
    private static class Node<E> {
        Comparable<E> info;
        Node<E> left, right;

        public Node(Comparable<E> i) {
            this.info = i;
            this.left = null;
            this.right = null;
        }

        public Node(Comparable<E> i, Node<E> l, Node<E> r) {
            this.info = i;
            this.left = l;
            this.right = r;
        }
    }

    private Node root = null;

    //	Them 1 node vao cay BST
    private Node<E> add(Node<E> r, Comparable<E> e) {
        if (r == null) {
            r = new Node<>(e);
            return r;
        }
        if (e.compareTo((E) r.info) < 0)
            r.left = add(r.left, e);
        else if (e.compareTo((E) r.info) > 0)
            r.right = add(r.right, e);
        return r;
    }

    public void add(Comparable<E> x) {
        root = add(root, x);
    }

    //	tim x
    private boolean find(Node<E> r, Comparable<E> e) {
        if (r == null)
            return false;
        else if (e.compareTo((E) r.info) == 0)
            return true;
        else if (e.compareTo((E) r.info) < 0)
            return find(r.left, e);
        else return find(r.right, e);
    }

    public boolean find(Comparable<E> x) {
        return find(root, x);
    }

    //	duyet trung tu
    private void midOrder(Node r) {
        if (r != null) {
            midOrder(r.left);
            System.out.print(r.info + " ");
            midOrder(r.right);
        }
    }

    public void midOrder() {
        midOrder(root);
    }

    //	Find Max and Min
    private E max_Value(Node r) {
        if (r.right == null)
            return (E) r.info;
        return max_Value(r.right);
    }

    public E max_Value() {
        return max_Value(root);
    }

    private E min_Value(Node r) {
        if (r.left == null)
            return (E) r.info;
        return min_Value(r.left);
    }

    public E min_Value() {
        return min_Value(root);
    }

    //	kiem tra cay co phai la cay BST hay không
    private boolean is_Tree_Bst(Node r, int min, int max) {
        if (r == null)
            return true;
        if ((int) r.info <= min || (int) r.info >= max)
            return false;
        return is_Tree_Bst(r.left, min, (int) r.info) && is_Tree_Bst(r.right, (int) r.info, max);
    }

    public boolean is_Tree_Bst() {
        return is_Tree_Bst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    //	Xoa node khoi cay
    int minValue(Node r) {
        int min = (int) r.info;
        while (r.left != null) {
            min = (int) r.left.info;
            r = r.left;
        }
        return min;
    }

    private Node delete_Node(Node r, int data) {
        if (r == null)
            return r;
        if (data < (int) r.info)
            delete_Node(r.left, data);
        else if (data > (int) r.info)
            delete_Node(r.right, data);
        else {
            if (r.left == null && r.right == null) //nếu là node lá
                return null;
            else if (r.left == null)
                return r.right;    //nếu node cần xoá chỉ có node bên phải
            else if (r.right == null)
                return r.left;    //nếu node cần xoá chỉ có node bên trái
            //có 2 con
			r.info = minValue(r.right);
			r.right = delete_Node(r.right, (int) r.info);
//            Node p = r.left;
//            while (p.right != null) p = p.right;
//            r.info = p.info;
//            r.left = delete_Node(r.left, (int) p.info);
        }
        return r;
    }

    public void delete_Node(int data) {
        root = delete_Node(root, data);
    }

    //	Duyệt theo chiều rộng
    public void duyet_Chieu_Rong() {
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            Node x = q.remove();
            System.out.print(x.info + " ");
            if (x.left != null) q.add(x.left);
            if (x.right != null) q.add(x.right);
        }
    }

    public static void main(String[] args) {
        Delete_Node_BinaryTree<Integer> B = new Delete_Node_BinaryTree<>();
		/*
		 		50
		 	   /  \
		 	 30	   70
		 	/  \   /  \
		  20   40 60  80
		 */
        B.add(50);
        B.add(30);
        B.add(20);
        B.add(40);
        B.add(70);
        B.add(60);
        B.add(80);
//		B.add(90);
        B.duyet_Chieu_Rong();
        System.out.println();
        B.delete_Node(20);
        B.midOrder();
//		B.duyet_Chieu_Rong();
//		System.out.println();
//		System.out.println(B.max_Value());
//		System.out.println(B.min_Value());
//		System.out.println(B.find(7));
//		System.out.println(B.is_Tree_Bst());

    }


}
