import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Correlation<T extends Number & Comparable<T>> {

    private T correlationCoefficient;

    @SuppressWarnings("unchecked")
    public void calculateCorrelation(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        Mean<Double> meanCalculator1 = new Mean<>(Double.class);
        meanCalculator1.calculateMean(arr1);

        double mean1 = meanCalculator1.getMean();

        Mean<Double> meanCalculator2 = new Mean<>(Double.class);
        meanCalculator2.calculateMean(arr2);

        double mean2 = meanCalculator2.getMean();

        double covariance = 0;
        double variance1 = 0;
        double variance2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            double diff1 = arr1[i].doubleValue() - mean1;
            double diff2 = arr2[i].doubleValue() - mean2;
            covariance += diff1 * diff2;
            variance1 += diff1 * diff1;
            variance2 += diff2 * diff2;
        }

        double correlation = covariance / Math.sqrt(variance1 * variance2);
        this.correlationCoefficient = (T) Double.valueOf(correlation);
    }
}
