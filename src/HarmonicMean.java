public class HarmonicMean {
    public static <T extends Number> double Hmean(T[] numbers) {
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

        return numbers.length / reciprocalSum;
    }
}
