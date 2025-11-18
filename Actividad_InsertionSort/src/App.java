import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Double[] temperaturas = {21.3, 23.5, 22.0, 23.2, 25.6, 18.7, 19.3, 20.5, 22.4};
        InsertionSort sort = new InsertionSort();
        Double[] maxArr = new Double[3];
        Double[] minArr = new Double[3];

        System.out.println("Las temperaturas ingresadas fueron: " + Arrays.toString(temperaturas));
        sort.sort(temperaturas);

        for (int i = 0; i < 3; i++) {
            minArr[i] = temperaturas[i];
        }
        for (int i = 0; i < 3; i++) {
            maxArr[i] = temperaturas[temperaturas.length - 1 - i];
        }

        System.out.println("La temperatura máxima fue: " + maxArr[0]);
        System.out.println("La temperatura mínima fue: " + minArr[0]);
        System.out.println("El rango de las temperaturas fue de: " + String.format("%.1f", (maxArr[0] - minArr[0])));
        System.out.println("La 3 temperaturas máximas fueron: " + Arrays.toString(maxArr));
        System.out.println("La 3 temperaturas mínimas fueron: " + Arrays.toString(minArr));
    }
}