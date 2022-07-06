package ss11_stack_and_queue.bai_tap.reverseByStack;

public class MyStackArray<E> {
    private int top;
    private int size;
    private E[] array;

    // Hàm khởi tạo không tham số
    public MyStackArray() {
        size = 0;
        top = -1;
        array = (E[]) new Object[10];
    }

    // Hàm khởi tạo có tham số
    public MyStackArray(int size) {
        this.size = size;
        top = -1;
        array = (E[]) new Object[size];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public boolean isFully() {
        return top == size - 1;
    }

    public E peek() {
        if (top == -1) {
            System.out.println(" Stack is empty. Can not get");
            return null;
        }
        return array[top];
    }

    public E pop() {
        if (top == -1) {
            System.out.println(" Stack is empty. Can not get");
            return null;
        }
        E x = array[top];
        array[top] = null; // lay ve phan tu o top va xoa phan tu do;
        top--;
        size--;
        return x;
    }

    public E push(E x) {
        if (isFully()) {
            System.out.println("stack is full. Can not push");
            return null;
        }
        top++;
        array[top] = x;
        size++;
        return x;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i <= top; i++)
            s = s + array[i] + " ";
        return s;
    }

    public static void main(String[] args) {
        MyStackArray<Integer> stackInteger = new MyStackArray<Integer>(10);
        stackInteger.push(1);
        stackInteger.push(2);
        stackInteger.push(3);
        stackInteger.push(4);
        System.out.println(stackInteger);
//        System.out.println(stackInteger.peek());
//        System.out.println(stackInteger.pop());
//        System.out.println(stackInteger);
    }
}
