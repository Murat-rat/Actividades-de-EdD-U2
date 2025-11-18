import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BubbleSort sort = new BubbleSort();
        int[] arr = new int[10];

        System.out.println("Va a ingresar 10 números.");
        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese el " + (i + 1) + "° número: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("El arreglo original es: " + Arrays.toString(arr));
        sort.sort(arr);
        System.out.println("El número más grande es: " + arr[9]);
        System.out.println("El número más pequeño es: " + arr[0]);
        System.out.println("El rango de los números es: " + (arr[9] - arr[0]));
    }
}