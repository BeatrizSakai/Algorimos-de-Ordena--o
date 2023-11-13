public class Main {
    public static void main(String[] args) {
        //Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Método de ordenação: BUBBLE SORT");
        bubbleSort.imprimeArray();
        System.out.println(" ");

        //Insetion Sort
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("\nMétodo de ordenação: INSERTON SORT");
        insertionSort.imprimeArray();
        System.out.println(" ");

        //Quick Sort
        QuickSort quickSort = new QuickSort();
        System.out.println("\nMétodo de ordenação: QUICK SORT");
        quickSort.imprimeArray();
        System.out.println(" ");
    }
}
