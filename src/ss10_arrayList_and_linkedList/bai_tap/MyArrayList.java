package ss10_arrayList_and_linkedList.bai_tap;

import java.util.Arrays;

public class MyArrayList<E> {
    // Số lượng phần tử trong MyArrayList.
    private int size;
    // Sức chứa mặc định trong MyArrayist
    private static final int DEFAULT_CAPACITY = 10;
    // Mảng đối tượng elements chứa các phần tử trong MyArrayList.
    private Object[] elements;

    // Hàm khởi tạo không đối số.
    public MyArrayList() {
        System.out.println("Khởi tạo thành công MyArrayList có kích thước mặc định là: " + DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Hàm khởi tạo có đối số
    public MyArrayList(int capacity) {
        if (capacity > 0) {
            System.out.println("Khởi tạo thành công MyArrayList có kích thước là: " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Lỗi tham số truyền vào!");
            throw new IndexOutOfBoundsException("Capacity: " + capacity);
        }
    }

    // phương thức tăng kích thước của ArrayList.
    public void ensureCapacity(int initialCapacity) {
        if (initialCapacity >= 0) {
            int newSize = this.elements.length + initialCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khởi tạo thành công với kích thước sau khi tăng thêm là: " + elements.length);
        } else {
            throw new IndexOutOfBoundsException("Initial capacity: " + initialCapacity);
        }
    }

    // phương thức size trả về số phần tử trong mảng.
    public int size() {
        return size;
    }

    // phương thức trả về kích thước của MyArrayList.
    public int length() {
        return elements.length;
    }

    // phương thức trả về phần tử tại vị trí index.
    public E get(int index) {
        return (E) elements[index];
    }

    // phương thức thêm một phần tử vào cuối ArrayList.
    public boolean add(E e) {
        if (size == elements.length)
            ensureCapacity(10);
        elements[size] = e;
        size++;
        return true;
    }

    // phương thức thêm phần tử vào vị trí index.
    public void add(E e, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index : " + index);
        } else if (elements.length == index) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            elements[index] = e;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
            size++;
        }
    }

    // phương thức xóa phấn tử tại vị trí index.
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Error index: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements;
    }

    // phương thức tạo ra một bản sao của MyArrayList.
    public MyArrayList<E> clone() {
        MyArrayList<E> newArrayList = new MyArrayList<>();
        newArrayList.size = size;
        newArrayList.elements = Arrays.copyOf(elements, size);
        return newArrayList;
    }

    // phương thức trả về vị trí của 1 phần tử trong MyArrayList.
    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // phương thức kiểm tra 1 phần tử có tồn tại trong ArrayList hay không.
    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    // phương thức xóa tất cả các phần tử trong ArrayList.
    public void clear() {
        size = 0;
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }
}
