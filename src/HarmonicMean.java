import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class HarmonicMean <T extends Number> {
    private double Hm;
    public void Hmean(T[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        double reciprocalSum = 0;
        for (T number : numbers) {
            double value = number.doubleValue();
            if (value == 0) {
                throw new IllegalArgumentException("Cannot calculate harmonic mean with zero.");
            }
            reciprocalSum += 1 / value;
        }

        this.Hm=numbers.length / reciprocalSum;
    }
}
