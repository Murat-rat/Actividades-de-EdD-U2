public class App {
    public static void main(String[] args) throws Exception {
        int[][] arrExample={
            {2,5,0,1},
            {5,1,9,5},
            {9,5,2,8},
            {4,0,0,4},
            {7,5,1,2}
        };
        int resultado = 0;
        int total = 0;

        for (int i = 0; i < arrExample.length; i++) {
            for (int j = 0; j < arrExample[i].length; j++) {
                if (i == j) {
                    System.out.println("Se salto: " + arrExample[i][j]);
                } else {
                    resultado += arrExample[i][j];
                    total += arrExample[i][j];
                }
            }
            System.out.println("El resultado de la línea " + i +" es: " + resultado);
            resultado = 0;
        }
        System.out.println("El total del arreglo es: " + total);
    }
}