import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Multimode <T extends Number & Comparable<T>> {
    
    java.util.List<T> multimodes = new java.util.ArrayList<>();
    java.util.Map<T, Integer> frequencyMap = new java.util.HashMap<>();

    public void CalculateMultimode(T[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (T element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        int maxFrequency=0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        for (java.util.Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                multimodes.add(entry.getKey());
            }
        }

    }

}
