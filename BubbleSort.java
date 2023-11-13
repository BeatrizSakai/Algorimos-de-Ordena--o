public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimeArray() {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array antes da ordenação:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array depois da ordenação:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
