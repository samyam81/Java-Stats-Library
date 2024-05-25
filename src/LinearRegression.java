import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinearRegression<T extends Number & Comparable<T>> {

    private T slope;
    private T intercept;

    @SuppressWarnings("unchecked")
    public void fit(T[] x, T[] y) {
        if (x.length != y.length)
            throw new IllegalArgumentException("Arrays must have the same length");

        Mean<Double> meanCalculator1 = new Mean<>(Double.class);
        meanCalculator1.calculateMean(x);
        double meanX = meanCalculator1.getMean();

        meanCalculator1.calculateMean(y);
        double meanY = meanCalculator1.getMean();

        double numerator = 0.0;
        double denominator = 0.0;

        for (int i = 0; i < x.length; i++) {
            numerator += (x[i].doubleValue() - meanX) * (y[i].doubleValue() - meanY);
            denominator += Math.pow(x[i].doubleValue() - meanX, 2);
        }

        double slopeValue = numerator / denominator;
        double interceptValue = meanY - slopeValue * meanX;

        // Convert double values back to type T
        if (x[0] instanceof Integer) {
            slope = (T) Integer.valueOf((int) slopeValue);
            intercept = (T) Integer.valueOf((int) interceptValue);
        } else if (x[0] instanceof Double) {
            slope = (T) Double.valueOf(slopeValue);
            intercept = (T) Double.valueOf(interceptValue);
        }
    }

}
