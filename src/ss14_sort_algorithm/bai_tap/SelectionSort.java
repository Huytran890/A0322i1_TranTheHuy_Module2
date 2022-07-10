package ss14_sort_algorithm.bai_tap;

public class SelectionSort {
    private static double[] array = {2, 1.5, 6.6, 10, 15, 98, 53, 7.4, 1.2, 8.3};

    public static void selectSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("The list begging is: ");
        for (double array : array) {
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.print("The list after sorting by select is: ");
        selectSort(array);
        for (double array : array)
            System.out.print(array + " ");
    }
}
