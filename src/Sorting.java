import lombok.Getter;

@Getter
public class Sorting {
    // Constructor
    public Sorting() {
    }

    // Method to sort an array
    public  Sorting(int[] arr) {
        if (arr.length < 10) 
            insertionsort(arr, arr.length);
        else 
            sortQuick(arr, 0, arr.length - 1);

    }

    // Insertion sort method
    private static void insertionsort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    // Quick sort method
    private static void sortQuick(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sortQuick(arr, low, pi - 1);
            sortQuick(arr, pi + 1, high);
        }
    }

    // Partition method for quick sort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // Swap method
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
