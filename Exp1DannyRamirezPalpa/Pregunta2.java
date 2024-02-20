package Exp1DannyRamirezPalpa;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int contador = 0; // Variable para contar el número de introducciones
    int maxRepeticiones = 0; // Variable para almacenar el número máximo de repeticiones
    int numeroMaxRepetido = 0; // Variable para almacenar el número que se repitió más veces
    int repeticionesActuales = 0; // Variable para contar las repeticiones del número actual

    System.out.println("Introduce números (introduce 0 para finalizar):");
        int numero;
        do {
            numero = s.nextInt(); // Lee el número introducido por el usuario
            if (numero != 0) {
                contador++; // Incrementa el contador de introducciones

                if (numero == numeroMaxRepetido) {
                    repeticionesActuales++; // Incrementa las repeticiones del número actual
                } else {
                    if (repeticionesActuales > maxRepeticiones) {
                        maxRepeticiones = repeticionesActuales; // Actualiza el número máximo de repeticiones
                        numeroMaxRepetido = numero; // Actualiza el número que se repitió más veces
                    }
                    repeticionesActuales = 1; // Reinicia el contador de repeticiones del nuevo número
                }
            }
        } while (numero != 0);  // Verifica si el último número introducido fue el que tuvo más repeticiones
        if (repeticionesActuales > maxRepeticiones) {
            maxRepeticiones = repeticionesActuales;
            numeroMaxRepetido = numero;
        }

        // Imprime el resultado
        System.out.println("El número más repetido es el " + numeroMaxRepetido + " y se ha escrito " + maxRepeticiones + " veces.");
        System.out.println("Se introdujeron un total de " + contador + " números.");

        s.close();
    }
}


