import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Covarience <T extends Number & Comparable<T>> {

  private T CoVar;

  @SuppressWarnings("unchecked")
  public void CalculateCovarience(T[] arr1,T[] arr2){
      if (arr1.length != arr2.length) {
          throw new IllegalArgumentException("Arrays must have the same length");
      }

      Mean<Double> meanCalculator1 = new Mean<>(Double.class);
      meanCalculator1.calculateMean(arr1);

      double mean1=meanCalculator1.getMean();

      Mean<Double> meanCalculator2 = new Mean<>(Double.class);
      meanCalculator2.calculateMean(arr2);

      double mean2 = meanCalculator2.getMean();

      double covariance = 0;
      for (int i = 0; i < arr1.length; i++) {
        covariance += (arr1[i].doubleValue() - mean1) * (arr2[i].doubleValue() - mean2);
      }

      covariance /= arr1.length;
      this.CoVar= (T) Double.valueOf(covariance);

  }

}