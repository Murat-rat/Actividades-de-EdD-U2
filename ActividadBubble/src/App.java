import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        BubbleSort sort = new BubbleSort();
        int[] calificaciones = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Por favor ingrese su " + (i+1) + "° Calificación: ");
            calificaciones[i] = scan.nextInt();
        }

        sort.sort(calificaciones);
    }
}