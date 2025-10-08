public class App {
    public static void main(String[] args) throws Exception {
        int[][] arrExample={
            {2,5,0,1},
            {5,1,9,5},
            {9,5,2,8},
            {4,0,0,4},
            {7,5,1,2}
        };
        int total = 0;

        for (int[] fila : arrExample) {
            for (int valor : fila) {
                total += valor;
            }
        }
        System.out.println("El total del arreglo es: " + total);
    }
}
