import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeometricMean<T extends Number> {

    private double Gm;

    public void Gmean(T[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        double product = 1.0;
        for (T num : numbers) {
            product *= num.doubleValue();
        }

        this.Gm = Math.pow(product, 1.0 / numbers.length);
    }
}
