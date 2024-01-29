package Ejercicio3;

import java.util.Scanner;

public class multiplicacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa 2 numeros a multiplicarse: ");
        double numero1 = s.nextDouble();
        double numero2 = s.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);

    }
}
