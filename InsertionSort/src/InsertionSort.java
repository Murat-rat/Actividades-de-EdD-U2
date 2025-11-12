import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) { //Comenzamos del segundo elemento
            int key = arr[i]; //Elemento que vamos a insertar en la parte ordenada
            int j = i -1;

            while (j >= 0 && arr[j] > key) { //Recorrer la parte ordenada e insertar i en su posición
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; //Inserción de del elemento j¿key dentro de la parte ordenada
        }

        System.out.print("El arreglo ordenado es: " +  Arrays.toString(arr));
    }
}