package ss13_search_algorithm.bai_tap;

public class BinarySearch_UsingDequeue {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (value < array[mid]) {
                return binarySearch(array, left, mid - 1, value);
            } else if (value > array[mid]) {
                return binarySearch(array, mid + 1, right, value);
            } else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, 0, 9, 10));
    }
}
