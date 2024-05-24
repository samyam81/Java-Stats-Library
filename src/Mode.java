import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mode<T extends Number> {

    private T mode;

    public void calculateMode(T[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        // Create a map to store the frequency of each element
        Map<T, Integer> frequencyMap = new HashMap<>();
        for (T num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with the maximum frequency and set it as mode
        T modeValue = null;
        int maxFrequency = 0;
        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                modeValue = entry.getKey();
            }
        }

        // Set the mode value
        this.mode = modeValue;
    }
}
