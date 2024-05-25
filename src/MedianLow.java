import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MedianLow <T extends Number> {

    private double ML;

    public  void Low(T[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        Integer[] arr = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i].intValue();
        }

        // Use Sorting class to sort the array
        new Sorting<>(arr);

        int length = arr.length;
        if (length % 2 == 1)  // Odd number of elements
            this.ML= arr[length / 2];
         else { // Even number of elements
            double middle1 = arr[length / 2 - 1];
            double middle2 = arr[length / 2];
            this.ML = Math.min(middle1, middle2);
        }
}
}
