
import java.util.Scanner;


public class Ejerrcicio6 {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = sc.nextInt();
        
        int[][] matriz = new int[n][m];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int filaInicio = 0, filaFin = n - 1, colInicio = 0, colFin = m - 1;
        System.out.println("Recorrido en espiral:");
        while (filaInicio <= filaFin && colInicio <= colFin) {
            for (int i = colInicio; i <= colFin; i++) System.out.print(matriz[filaInicio][i] + " ");
            filaInicio++;
            for (int i = filaInicio; i <= filaFin; i++) System.out.print(matriz[i][colFin] + " ");
            colFin--;
            if (filaInicio <= filaFin) {
                for (int i = colFin; i >= colInicio; i--) System.out.print(matriz[filaFin][i] + " ");
                filaFin--;
            }
            if (colInicio <= colFin) {
                for (int i = filaFin; i >= filaInicio; i--) System.out.print(matriz[i][colInicio] + " ");
                colInicio++;
            }
        }
        
        
        
        
        
        
        
    }
}
