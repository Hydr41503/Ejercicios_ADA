
import java.util.Scanner;


public class Ejercicio3 {
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

        int sumaPerimetro = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if (i == 0 || i == d - 1 || j == 0 || j == d - 1) {
                    sumaPerimetro += matriz[i][j];
                }
            }
        }

        System.out.println("Suma del perímetro: " + sumaPerimetro);
        
        
        
    }
}
