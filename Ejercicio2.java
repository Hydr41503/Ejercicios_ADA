
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la dimensión de la matriz (d): ");
        int d = sc.nextInt();
        
        int[][] matriz = new int[d][d];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz rotada 90°:");
        for (int j = 0; j < d; j++) {
            for (int i = d - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        
        
        
        
        
    }
}
