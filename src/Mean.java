public class Mean {

    public static <T extends Number> double AvG(T[] numbers) {
        double sum = 0.0;
        for (T num : numbers) {
            sum += num.doubleValue(); // Extract the double value from the Number object
        }
        double average = sum / numbers.length;
        return average;
    }
}
