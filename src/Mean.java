import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mean<T extends Number> {

    private double mean;

    public void calculateMean(T[] numbers) {
        double sum = 0.0;
        for (T num : numbers) {
            sum += num.doubleValue(); // Extract the double value from the Number object
        }
        double AvG=sum / numbers.length;

        this.mean=AvG;
    }
}
