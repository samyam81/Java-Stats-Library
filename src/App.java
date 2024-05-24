import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 5, 6, 3, 2, 5, 8 };
        new Sorting(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Median of the array: " + (int) Median.Mid(arr));

        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        Double[] arr2 = { 1.0, 2.5, 3.5, 4.0, 5.5 }; 

        System.out.println("Mean of the array is " + Mean.AvG(arr1));
        System.out.println("Mean of the second array is " + Mean.AvG(arr2));

        System.out.println("Geometric mean of the array is "+GeometricMean.Gmean(arr1));

    }
}
