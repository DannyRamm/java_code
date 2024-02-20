package Exp1DannyRamirezPalpa;
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario
public class Pregunta2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        System.out.println("Introduce números (introduce 0 para finalizar):"); // Solicitamos al usuario que introduzca números

        int numero; // Declara una variable para almacenar el número introducido por el usuario
        int contadorIntroducciones = 0; // Inicializa un contador para registrar el número de introducciones
        int maxRepeticiones = 0; // Inicializa una variable para almacenar el número máximo de repeticiones consecutivas
        int numeroMaxRepetido = 0; // Inicializa una variable para almacenar el número que se repitió más veces
        int repeticionesActuales = 0; // Inicializa un contador para registrar las repeticiones consecutivas actuales
        int ultimoNumero = -1; // Inicializa una variable para almacenar el último número introducido por el usuario, se inicia en -1 para que no afecte en la lógica

        while (true) { // Inicia un bucle infinito; con el true que sirve para condición para crear un bucle infinito
            numero = s.nextInt(); // Lee el número introducido por el usuario

            if (numero == 0) { // Verifica si el número introducido es cero
                break; // Sale del bucle si el número introducido es cero
            }
            contadorIntroducciones++; // Incrementa el contador de introducciones

            if (numero == ultimoNumero) { // Verifica si el número introducido es igual al último número introducido
                repeticionesActuales++; // Incrementa el contador de repeticiones consecutivas actuales
            } else { // Si el número introducido es diferente al último número introducido
                if (repeticionesActuales > maxRepeticiones) { // Verifica si las repeticiones actuales son mayores que las máximas repeticiones registradas
                    maxRepeticiones = repeticionesActuales; // Actualiza el número máximo de repeticiones consecutivas
                    numeroMaxRepetido = ultimoNumero; // Actualizamos  el número que se repitió más veces
                }
                repeticionesActuales = 1; // Reinicia el contador de repeticiones consecutivas actuales
                ultimoNumero = numero; // Actualiza el último número introducido por el usuario
            }
        }

        if (repeticionesActuales > maxRepeticiones) { // Verifica si las repeticiones actuales son mayores que las máximas repeticiones registradas después de salir del bucle
            maxRepeticiones = repeticionesActuales; // Actualiza el número máximo de repeticiones consecutivas
            numeroMaxRepetido = ultimoNumero; // Actualiza el número que se repitió más veces
        }

        // Imprime el número de introducciones y el número más repetido junto con la cantidad de veces seguidas que apareció
        System.out.println("Número de introducciones: " + contadorIntroducciones);
        System.out.println("El número más repetido es el " + numeroMaxRepetido + " y se ha escrito " + maxRepeticiones + " veces.");

        s.close(); // Cerramos el scanner
    }
}

