import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Median<T extends Number & Comparable<T>> {

    private double Md;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    
    public void Mid(T[] arr) {
        new Sorting(arr);
        int n = arr.length;
        if (n % 2 != 0)
            this.Md = arr[n / 2].doubleValue();
        else {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            this.Md = (arr[mid1].doubleValue() + arr[mid2].doubleValue()) / 2.0;
        }
    }
}
