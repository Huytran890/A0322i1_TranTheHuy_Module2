package ss14_sort_algorithm.bai_tap;

public class InsertSort {
    private static double[] array = {2, 1.5, 6.6, 10, 15, 98, 53, 7.4, 1.2, 8.3};

    private static void insertionSort(double[] list) {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            double temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.print("The list begging is: ");
        for (double array : array) {
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.print("The list after sorting is: ");
        insertionSort(array);
        for (double array : array)
            System.out.print(array + " ");
    }
}
