
import java.util.Scanner;


public class Ejercicio4 {

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

        System.out.println("Matriz transpuesta:");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
    }
}
