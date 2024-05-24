import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 5, 6, 3, 2, 5, 8 };
        new Sorting(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("Median of the array: " + (int) Median.Mid(arr));

        Integer[] arr1 = { 1, 9, 3, 7, 5, 13, 11, 15, 2, 10, 4, 8, 6, 14, 12, 16 };

        Double[] arr2 = { 1.0, 2.5, 3.5, 4.0, 5.5 }; 

        System.out.println("Mean of the array is " + Mean.AvG(arr1));

        System.out.println("Mean of the second array is " + Mean.AvG(arr2));

        System.out.println("Geometric mean of the array is "+GeometricMean.Gmean(arr1));

        System.out.println("Geometric mean of the array is " + HarmonicMean.Hmean(arr2));

        System.out.println("Low Median of the array: " + (int) MedianLow.Low(arr1));

        System.out.println("High Median of the array: " + (int) MedianHigh.High(arr1));
    }
}
