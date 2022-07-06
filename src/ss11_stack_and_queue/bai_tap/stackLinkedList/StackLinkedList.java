package ss11_stack_and_queue.bai_tap.stackLinkedList;

import java.util.Scanner;
import java.util.Stack;

public class StackLinkedList<E> {
    public class Node {
        private E info;
        private Node next;

        public Node(E info) {
            this.info = info;
            this.next = null;
        }

        public Node(E info, Node next) {
            this.info = info;
            this.next = next;
        }

        // Khai báo các thuộc tính của stack --------
        private int size;
        private Node top;

        public void StackLinkedList() {
            top = null;
            size = 0;
        }

        public boolean isEmpty() {
            if (top == null)
                return true;
            return false;
        }

        public E peek() {
            if (top == null) {
                System.out.println("Stack is empty. Can not peek");
                return null;
            }
            return top.info;
        }

        public E pop() {
            if (top == null) {
                System.out.println("Stack is empty. Can not get");
                return null;
            }
            E x = top.info;
            top = top.next;
            size--;
            return x;
        }

        public E push(E x) {
            Node q = new Node(x);
            if (top == null)
                top = q;
            else {
                q.next = top;
                top = q;
            }
            size++;
            return x;
        }

        public String toString() {
            String s = "";
            Node p = top;
            while (p != null) {
                s = p.info + " " + s;
                p = p.next;
            }
            return s;
        }
    }

    //	Kiem tra dong mo ngoac co dung hay ko
    private static final String OPEN = "([{";
    private static final String CLOSE = ")]}";

    private static boolean isOpen(char ch) {
        return (OPEN.indexOf(ch) > -1);
    }

    private static boolean isClose(char ch) {
        return (CLOSE.indexOf(ch) > -1);
    }

    public static boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        boolean balanded = true;
        while (balanded && index < str.length()) {
            char nextCh = str.charAt(index);
            if (isOpen(nextCh)) {
                stack.push(nextCh);
            } else if (isClose(nextCh)) {
                char topCh = stack.pop();
                balanded = OPEN.indexOf(topCh) == CLOSE.indexOf(nextCh);
            }
            index++;
        }
        balanded = false;
        return stack.isEmpty();
    }

    // Kiem tra do uu tien cua cac phep toan hang
    public static int priority(char aChar) {
        switch (aChar) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String inFixToPostFix(String infix) {
        String posfix = "";
        Stack<Character> operatorStack = new Stack<>();
        char x;
        for (int i = 0; i < infix.length(); i++) {
            // lay tung ki tu trong infix
            x = infix.charAt(i);
            if (Character.isDigit(x)) // kiem tra x la so thi day vao chuoi
                posfix += x;
            else if (isOpen(x)) // kiem tra x la dau mo ngoac '(' thi day vao stack
                operatorStack.push(x);
            else if (isClose(x)) { // kiem tra x la dau dong ngoac ')' thi
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') // đẩy cac toan hang trong stack ra
                    // trong khi stack!= rong va top in
                    // stack !='('
                    posfix += operatorStack.pop();
                operatorStack.pop();// sao khi day toan hang xong thi trong stack con dau '(' thi xoa di
            } else { // Neu x la toan hang thi
                while (!operatorStack.isEmpty() && priority(x) <= priority(operatorStack.peek())) // day toan hang vao
                    // chuoi
                    // ma phai so sanh
                    // do uu
                    // tien cua toan
                    // hang
                    // trong khi stack!=
                    // rong
                    posfix += operatorStack.pop();
                operatorStack.push(x);
            }
        }
        while (!operatorStack.isEmpty()) { // nhap het tat ca trong stack vao chuoi
            posfix += operatorStack.pop();
        }
        return posfix;
    }

    public static double calculatingPostfix(String postfix) {
        Scanner sc = new Scanner(System.in);
        Stack<String> operCharacters = new Stack<>();
        char c;
        double result = 0;
        Integer a = 0;
        for (int index = 0; index < postfix.length(); index++) {
            c = postfix.charAt(index);
            if (Character.isDigit(c)) {
                if (Character.isDigit(postfix.charAt(index + 1)) && Character.isDigit(postfix.charAt(index + 2))) {
                    String value = String.valueOf(c);
                    while (Character.isDigit(postfix.charAt(index + 1))
                            && Character.isDigit(postfix.charAt(index + 2))) {
                        index++;
                        value += postfix.charAt(index);
                    }
                    operCharacters.push(value);
                } else
                    operCharacters.push(String.valueOf(c));
            } else if (Character.isLetter(c)) {
                System.out.print("Nhap gia tri " + c + " :");
                a = sc.nextInt();
                operCharacters.push(String.valueOf(a));
            } else {
                Double rightOperator = Double.parseDouble(String.valueOf(operCharacters.pop()));
                Double leftOperator = Double.parseDouble(String.valueOf(operCharacters.pop()));
                switch (c) {
                    case '+':
                        result = leftOperator + rightOperator;
                        operCharacters.push(String.valueOf(result));
                        break;
                    case '-':
                        result = leftOperator - rightOperator;
                        operCharacters.push(String.valueOf(result));
                        break;
                    case '*':
                        result = leftOperator * rightOperator;
                        operCharacters.push(String.valueOf(result));
                        break;
                    case '/':
                        result = leftOperator / rightOperator;
                        operCharacters.push(String.valueOf(result));
                        break;
                    case '^':
                        result = Math.pow(leftOperator, rightOperator);
                        operCharacters.push(String.valueOf(result));
                        break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
//        s.push(8);
//        System.out.println(s.toString());
//        String exp = "2+3*(4^5-6)";
//        System.out.println("Infix Expression: " + exp);
//        System.out.println("Postfix Expression: " + inFixToPostFix(exp));
        String str = "s * (s – a) * (s – b) * (s – c) ";
        if (checkBrackets(str))
            System.out.println("The string containing valid brackets.");
        else
            System.out.println("The string containing brackets is not valid!");
    }
}
