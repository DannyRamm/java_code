package Exp1DannyRamirezPalpa;

import java.util.Scanner;

public class Pregunta5 {
    public static void main(String[] args) {
       
    Scanner s = new Scanner(System.in);

        int positivos = 0; // Variable para contar los números positivos
        int negativos = 0; // Variable para contar los números negativos

        System.out.println("Introduce diez números:");

        for (int i = 0; i < 10; i++) {// Bucle para leer diez números
            int numero = s.nextInt(); // Lee el número introducido por el usuario

            if (numero >= 0) {//si el numero es mayor o igaul a 0 
                positivos++; // Incrementa el contador de números positivos si el número es mayor o igual a 0
            } else {
                negativos++; // Incrementa el contador de números negativos si el número es menor que 0
            }
        }

        // Imprime el resultado
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        s.close();
    }
}
