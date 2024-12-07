
import java.util.Scanner;


public class Ejerrcicio5 {

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

        boolean esSimetrica = true;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
        }

        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
        
        
    }
}
