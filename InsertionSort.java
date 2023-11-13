public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void imprimeArray() {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array antes da ordenação:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("Array depois da ordenação:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
