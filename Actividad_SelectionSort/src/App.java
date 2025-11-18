import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SelectionSort sort = new SelectionSort();
        int[] arr = new int[10];

        System.out.println("Va a ingresar 10 números.");
        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese el " + (i + 1) + "° número: ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Arreglo original: " + Arrays.toString(arr));
        System.out.println("--------------------------------");
        sort.paridad(arr);
    }
}
