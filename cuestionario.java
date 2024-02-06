import java.util.Scanner;
public class cuestionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al minicuestionario!");
        System.out.println("Responde las siguientes preguntas con 'a', 'b', 'c' o 'd'.");
        System.out.println();

        int puntaje = 0;

        System.out.println("1. ¿Qué es un algoritmo?");
        System.out.println("a) Un conjunto de instrucciones para resolver un problema.");
        System.out.println("b) Un lenguaje de programación.");
        String respuesta1 = scanner.nextLine().toLowerCase();
        if (respuesta1.equals("a")) {
            puntaje++;
        }

        System.out.println("2. ¿Cuál de las siguientes opciones describe mejor a un bucle while?");
        System.out.println("a) Se ejecuta mientras una condición sea verdadera.");
        System.out.println("b) Se ejecuta un número fijo de veces");
       
        String respuesta2 = scanner.nextLine().toLowerCase();
        if (respuesta2.equals("a")) {
            puntaje++;
        }

        System.out.println("3. ¿Cuál es la principal diferencia entre un algoritmo y un programa de computadora?");
        System.out.println("a) Un algoritmo es una secuencia de pasos para resolver un problema, mientras que un programa es una implementación de un algoritmo en un lenguaje de programación.");
        System.out.println("b) No hay diferencia entre un algoritmo y un programa.");
    
        String respuesta3 = scanner.nextLine().toLowerCase();
        if (respuesta3.equals("a")) {
            puntaje++;
        }

        System.out.println("4. ¿Cuál de los siguientes no es un tipo de estructura de datos en programación?");
        System.out.println("a) Pila");
        System.out.println("b) Cable");

        String respuesta4 = scanner.nextLine().toLowerCase();
        if (respuesta4.equals("b")) {
            puntaje++;
        }

        System.out.println("5. ¿Qué hace un condicional en programación?");
        System.out.println("a) Ejecuta ciertas instrucciones si se cumple una condición.");
        System.out.println("b)  Repite un conjunto de instrucciones un número determinado de veces.");
   
        String respuesta5 = scanner.nextLine().toLowerCase();
        if (respuesta5.equals("a")) {
            puntaje++;
        }

        System.out.println("6. ¿Qué es la recursividad en programación?");
        System.out.println("a)  Una técnica en la que una función se llama a sí misma.");
        System.out.println("b)  Un método para declarar variables en Java.");
    
        String respuesta6 = scanner.nextLine().toLowerCase();
        if (respuesta6.equals("a")) {
            puntaje++;
        }

        System.out.println("7. ¿Cuál de los siguientes es un lenguaje de programación orientado a objetos?");
        System.out.println("a) Java");
        System.out.println("b)  HTML");
     
        String respuesta7 = scanner.nextLine().toLowerCase();
        if (respuesta7.equals("a")) {
            puntaje++;
        }

        System.out.println("8. ¿Qué es un ciclo for en programación?");
        System.out.println("a) Un bucle que se ejecuta mientras una condición sea verdadera.");
        System.out.println("b) Un bucle que se repite un número fijo de veces.");

        String respuesta8 = scanner.nextLine().toLowerCase();
        if (respuesta8.equals("a")) {
            puntaje++;
        }

        System.out.println("9. ¿Qué es la complejidad algorítmica?");
        System.out.println("a)  La cantidad de recursos (tiempo, memoria) que necesita un algoritmo para resolver un problema en función del tamaño de entrada. ");
        System.out.println("b)  El número de líneas de código en un programa.");

        String respuesta9 = scanner.nextLine().toLowerCase();
        if (respuesta9.equals("a")) {
            puntaje++;
        }

        System.out.println("10. ¿Qué es la depuración en programación?");
        System.out.println("a) Proceso de identificar y corregir errores en el código.");
        System.out.println("b) Proceso de escribir código desde cero.");
     
        String respuesta10 = scanner.nextLine().toLowerCase();
        if (respuesta10.equals("a")) {
            puntaje++;
        }

        System.out.println("¡Terminaste el cuestionario!");
        System.out.println("Tu puntaje es: " + puntaje + " de 10.");

        scanner.close();
    }
}
