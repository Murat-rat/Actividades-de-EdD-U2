import java.util.Arrays;

public class BubbleSort {
    
    public void sort(int [] arr){
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n-1; i++) {//recorre el arreglo
            swapped = false;
            for (int j = 0; j < n-1; j++) {//recorre los indices
                if (arr[j] > arr[j+1]) { //memorizar este for
                    //se realiza el cambio de posicion
                    int temp = arr[j];//aqui se guarda el primer valor
                    arr[j] = arr[j+1];//hace el intercambio pero tiene el mismo valor
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println("ARREGLO ORDENADO");
        System.out.println(Arrays.toString(arr));
    }
}