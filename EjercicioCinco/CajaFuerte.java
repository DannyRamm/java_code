package EjercicioCinco;

import java.util.Scanner;
public class CajaFuerte {
 

public class ejercicio7 {
    public static void main(String[] args) {
        int combinacionCorrecta = 1234;

        Scanner s = new Scanner(System.in);

        int intentosMaximos = 4;
        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.print("Introduce el codigo de la caja fuerte (4 cifras): ");
            int combinacionUsuario = s.nextInt();

            if (combinacionUsuario == combinacionCorrecta) {
                System.out.println("La caja fuerte se ha abierto.");
                break;
            } else {
                System.out.println("Esa no es la combinación.");
                int intentosRestantes = intentosMaximos - intento;
                System.out.println("Te quedan " + intentosRestantes + " intentos.\n");
            }
        }
        s.close();
    }
}
}
