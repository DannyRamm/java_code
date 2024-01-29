package Ejercicios03;

import java.util.Scanner;

public class OperacionesMatematicas {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa el primer y segundo número: ");
        double numero1 = s.nextDouble();
        double numero2 = s.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;

        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (numero2 != 0) {
            System.out.println("División: " + division);
        }
    }
}
