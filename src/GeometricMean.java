public class GeometricMean {
    public static <T extends Number> double Gmean(T[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        double product = 1.0;
        for (T num : numbers) {
            product *= num.doubleValue();
        }

        return Math.pow(product, 1.0 / numbers.length);
    }
}
