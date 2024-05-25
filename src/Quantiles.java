import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Quantiles<T extends Number & Comparable<T>> {

    public T Quartz;

    @SuppressWarnings("unchecked")
    public void GetQuatiles(T[] arr, T quartile) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        new Sorting<>(arr);

        // Calculate the index of the quartile
        double index = (arr.length - 1) * quartile.doubleValue();

        // Calculate the position of the quartile in the sorted array
        int position = (int) Math.ceil(index);

        if (index == position)
            this.Quartz = arr[position];
        else {
            // Calculate the lower and upper bound for interpolation
            int lowerIndex = (int) Math.floor(index);
            double weight = index - lowerIndex;
            T lowerValue = arr[lowerIndex];
            T upperValue = arr[position];

            // Interpolate the quartile value
            double interpolatedValue = lowerValue.doubleValue() * (1 - weight) + upperValue.doubleValue() * weight;
            this.Quartz = (T) Double.valueOf(interpolatedValue); // Convert back to T type
        }

    }
}
