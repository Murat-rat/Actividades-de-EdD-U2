import java.util.Arrays;

public class SelectionSort{

    public void sort(int [] arr){
        int n = arr.length;
        int minndex;

        for (int i = 0; i < n-1; i++) {
            minndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minndex]) {
                    minndex = j;
                }
            }
            int temp = arr[minndex];
            arr[minndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public void paridad(int[] arr) {
        int numImpares = 0;
        int numPares = 0;
        int current = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                numPares++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                numImpares++;
            }
        }

        int[] arrPares = new int[numPares];
        int[] arrImpares = new int[numImpares];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arrPares[current] = arr[i];
                current++;
            }
        }
        sort(arrPares);

        current = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                arrImpares[current] = arr[i];
                current++;
            }
        }
        sort(arrImpares);

        System.out.println("Arreglo con pares: ");
        System.out.println(Arrays.toString(arrPares));
        System.out.println("----------------------------------");
        System.out.println("Arreglo con impares: ");
        System.out.println(Arrays.toString(arrImpares));
    }
}