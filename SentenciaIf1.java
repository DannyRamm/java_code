
import java.util.Scanner;

public class SentenciaIf1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();

        if (numero > 0) {
            System.out.println("El numero "+numero+" es positvo");

        }else{
            System.out.println("El numero "+numero+" es negativo");
        }
        /*
         * Operadores de comparacion
         * == igualdad a == b
         * != distinto a != b
         * < menor que a < b
         * > mayor que a > b
         * <= menor igual que a <= b
         * >= mayor igual que a >= b
         * Programa que pida al usuario una nota, si esta nota es mayor que 10.5
         * mostrar un mensaje de ha aprobado y caso contrario que indique que
         * desaproo el curso.
         * 
         */

         System.out.print("Ingrese la nota: ");
         double nota = s.nextDouble();
 
         if (nota > 10.5) {
             System.out.println("Has aprobado.");
         } else {
             System.out.println("has desaprobado.");
         }
 
         s.close();
    }
}