import lombok.Getter;

@Getter
public class Sorting<T extends Comparable<T>> {
    // Constructor
    public Sorting() {
    }

    // Method to sort an array
    public Sorting(T[] arr) {
        if (arr.length < 10)
            insertionSort(arr, arr.length);
        else
            quickSort(arr, 0, arr.length - 1);
    }

    // Insertion sort method
    private void insertionSort(T[] arr, int n) {
        for (int i = 1; i < n; i++) {
            T temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    // Quick sort method
    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method for quick sort
    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap method
    private void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
