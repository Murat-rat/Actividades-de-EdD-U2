import java.util.Arrays;

public class InsertionSort {
    public void sort(Double[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            Double key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Las temperaturas ordenadas son: " +  Arrays.toString(arr));
    }
}