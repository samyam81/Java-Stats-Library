import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mean<T extends Number & Comparable<T>> {

    private T mean;

    private final Class<T> clazz;

    public Mean(Class<T> clazz) {
        this.clazz = clazz;
    }

    public void calculateMean(Number[] numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue(); // Extract the double value from the Number object
        }
        double AvG = sum / numbers.length;

        try {
            this.mean = clazz.getDeclaredConstructor(double.class).newInstance(AvG);
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception properly in your code
        }
    }
}
