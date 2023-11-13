public class QuickSort {
    public static void quickSort(int[] arr) {
        quick(arr, 0, arr.length - 1);
    }

    private static void quick(int[] arr, int menor, int maior) {
        if (menor < maior) {
            int partitionIndex = partition(arr, menor, maior);
            quick(arr, menor, partitionIndex - 1);
            quick(arr, partitionIndex + 1, maior);
        }
    }

    private static int partition(int[] arr, int menor, int maior) {
        int pivo = arr[menor];
        int i = menor;
        for (int j = menor + 1; j <= maior; j++) {
            if (arr[j] < pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[menor];
        arr[menor] = temp;
        return i;
    }

    public static void imprimeArray() {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array antes da ordenação:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        quickSort(arr);

        System.out.println("Array depois da ordenação:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
