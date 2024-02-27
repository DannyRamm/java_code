package EJERCICIO6;

import java.util.Random;

public class NumDos { 

public static void main(String[] args) {
        // Definir el rango y el número de elementos
        int min = 100;
        int max = 199;
        int cantidadNumeros = 50;

        // Creamos un objeto Random para generar números aleatorios
        Random random = new Random();

        // Iniciamos variables para el máximo, mínimo y suma
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;

        // Generar y mostrar los números aleatorios
        System.out.print("Números aleatorios:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = random.nextInt(max - min + 1) + min;
            System.out.print(" " + numero);

            // Actualizar máximo, mínimo y suma
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
            suma += numero;
        }

        // Calcular y mostrar el máximo, mínimo y media
        double media = (double) suma / cantidadNumeros;
        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + media);
    }
}