package ss11_stack_and_queue.bai_tap;

public class StackArray<E> {
    private int top;
    private int size;
    private E[] array;

    // Hàm khởi tạo không tham số
    public StackArray() {
        size = 0;
        top = -1;
        array = (E[]) new Object[10];
    }

    // Hàm khởi tạo có tham số
    public 

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public
}
