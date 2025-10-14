public class App {
    public static void main(String[] args) throws Exception {
        int[][] arrEntrada = {
        {1},           // impar -> agrega 0
        {6,3,1},       // impar -> agrega 0
        {1,2,3,4},     // par   -> agrega (1+4)=5
        {0,5,3,0},     // par   -> agrega (0+0)=0
        {2,5,9},       // impar -> agrega 0
        {2,4,8,9,10}   // impar -> agrega 0
        };

        int[][] arrSalida = new int[arrEntrada.length][];

        for (int i = 0; i < arrEntrada.length; i++) {
            int b = arrEntrada[i].length;
            int[] filaNueva = new int[b + 1];
            
            for(int j = 0; j < b; j++) {
                filaNueva[j] = arrEntrada[i][j];
            }
            
            if (b % 2 == 1) {
                filaNueva[b] = 0;
            } else {
                filaNueva[b] = arrEntrada[i][0] + arrEntrada[i][b-1];
            }

            arrSalida[i] = filaNueva; 
        }

        System.out.println("{");
        for (int[] fila : arrSalida) {
            System.out.print("  ");
            for (int valor : fila) {
                System.out.print(valor + ",");
            }
            System.out.println("");
        }
        System.out.print("}");
    }
}

