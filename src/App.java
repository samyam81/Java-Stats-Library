import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Integer[] arr = { 1, 5, 6, 3, 2, 5, 8 };

        Integer[] arr1 = { 1, 9, 3, 7, 5, 13, 11, 15, 2, 10, 4, 8, 6, 14, 12, 16 };
        
        Double[] arr2 = { 1.0, 2.5, 3.5, 4.0, 5.5 };

        new Sorting<>(arr);

        System.out.println(Arrays.toString(arr));

        Median<Double> medianCalculator=new Median<>(); 
        medianCalculator.Mid(arr2);

        System.out.println("Median of the second array is "+medianCalculator.getMd());

        Mean<Double> meanCalculator = new Mean<>();
        meanCalculator.calculateMean(arr2);

        System.out.println("Mean of the second array is " + meanCalculator.getMean());

        GeometricMean<Double> geometricMean=new GeometricMean<>();
        geometricMean.Gmean(arr2);

        System.out.println("Geometric mean of the array is " + geometricMean.getGm());

        HarmonicMean<Double> harmonicMean = new HarmonicMean<>();
        harmonicMean.Hmean(arr2);

        System.out.println("Harmonic mean of the array is " + harmonicMean.getHm());

        System.out.println("Low Median of the array: " + (int) MedianLow.Low(arr1));

        System.out.println("High Median of the array: " + (int) MedianHigh.High(arr1));

        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 3, 4, 5, 5 };
        
        Mode<Integer> modeCalculator = new Mode<>();
        modeCalculator.calculateMode(numbers);

        System.out.println("Mode: " + modeCalculator.getMode());
    }
}
