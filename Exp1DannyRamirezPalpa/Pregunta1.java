package Exp1DannyRamirezPalpa;
import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //  aca creamos un objeto Scanner para leer la entrada de que le damos nosotros, agregando la variable s 
    System.out.println("muestra los números");
    System.out.println("Introducir el primer numero: ");
    int inicio = s.nextInt();// lee el primer numero y lo almacena en la variable inicio, añandiendo la variable int que sirve para numeros enteros

    System.out.println("Ingresa el ultimo numero");
    int fin = s.nextInt();// lee el ultimo numero y lo almacena en la variable fin; la variable int sirve para ingresar valores enteros 

    System.out.println("Ingresa el tamaño del grupo: "); 
    int tamañoGrupo = s.nextInt();// lee y almacena el tamaño del grupo


    int contador = 0; // controlamos el tamño del grupo asigando la variable contador, con el int que sirve para valores enteros
    for (int i = inicio; i <= fin; i++) {// iniciamos un bucle para hacer una secuencia de numeros se repite desde el primer número hasta el último
        System.out.println(i + " ");// Imprime el número actual itera sobre todos los valores de i desde inicio hasta fin, ejecutando el cuerpo del bucle una vez por cada valor de i. Cada vez que el bucle se ejecuta, i aumenta en uno.
        contador++;// Incrementamos el contador en uno para el grupo actual
        if (contador == tamañoGrupo) {// Si el contador alcanza el tamaño del grupo que le decimos nosotros
            contador = 0;// aqui se reinicia para comenzar un nuevo grupo 
            System.out.println();// separamos los grupos
            System.out.println(" ¿Quieres Continuar? (Si/No): ");// si quiere mas grupos aca se pregunta
            String continuar = s.next();// chequea la respuesta de nosotros
            if (!continuar.equalsIgnoreCase("S")){//  Si la respuesta no es "Si"; aca aplicamos con el if que es una condicional, con el equalignorecase: este compara la cadena independientemente si es mayuscula o miniscula.
                break;// Salimoss del bucle for, y asi concluimos el programa
            }

        }
    }
s.close();

    }
}
