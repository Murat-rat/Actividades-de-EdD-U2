import java.util.Arrays;

public class SelectionSort{

    public void sort(int [] arr){
        int n = arr.length;
        int minndex;

        for (int i = 0; i < n-1; i++) {//recorremos el arreglo evitando el desbordamiento
            minndex = i; //suponemos que el minimo es el primero
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minndex]) {
                    minndex = j;//seleccionamos el indice del elemento menor
                }
            }
            int temp = arr[minndex]; //guardamos el valor aqui (el valor minimo)
            arr[minndex] = arr[i]; //intercambio, mandamos el valor actual a la posicion del minimo
            arr[i] = temp;//en la posicion actual, guardamos el temporal
        }

        System.out.println("arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }

}