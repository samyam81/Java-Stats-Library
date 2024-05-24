import lombok.Getter;

@Getter

public class Median {
    
    public static double Mid(int[] arr){
        new Sorting(arr);
        int n = arr.length;
        if (n % 2 != 0) 
            return arr[n / 2];
        else {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            return (arr[mid1] + arr[mid2]) / 2.0;
        }
    }
}
