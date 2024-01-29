package Ejercicio3;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa la nota del primer examen (40%): ");
        double notaPrimerExamen = s.nextDouble();

        System.out.print("Ingresa la media deseada: ");
        double mediaDeseada = s.nextDouble();

        double notaSegundoExamen = ((mediaDeseada * 100) - (notaPrimerExamen * 40)) / 60;

        if (notaSegundoExamen >= 0 && notaSegundoExamen <= 10) {
            System.out.println("Necesitas sacar " + notaSegundoExamen + " en el segundo examen para alcanzar la media deseada.");
        } else {
            System.out.println("Error: La nota necesaria en el segundo examen está fuera del rango válido [0, 10].");
        }

    }
}
