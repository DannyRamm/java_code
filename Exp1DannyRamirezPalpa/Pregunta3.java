package Exp1DannyRamirezPalpa;

import java.util.Scanner;

public class Pregunta3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//asignamos la variables "s" que se utilizará para leer datos ingresados por el usuario desde la consola.

        System.out.println("se calcula el tiempo de caida");// imprimos un mensaje que da el proposito
        System.out.println("Introduce la altura desde la que cae el objeto (en metros):");//este codigo imprime un mensaje que introduce la altura desde la caida del objeto
        double altura = s.nextDouble();// Gravedad en metros/segundos^2 , declaramos  una variable llamada altura de tipo double, que es un tipo de dato en Java que puede almacenar números decimales.
        double g = 9.81; // Asiganamos la variable "g" con double porque es un valor decimal para calcular el tiempo de caída usando la fórmula tiempo = √(2h/g)
        double tiempo = Math.sqrt((2 * altura) / g);// asignamos la variable tiempò para almacenar la formula donde el "math.sqrt" significa la raiz y el resto es la formula 

        System.out.println("El tiempo que tardará en caer el objeto es de " + tiempo + " segundos.");//*imprimimos en la consola un mensaje que indica el tiempo calculado para que un objeto caiga desde una altura determinadael operador de concatenación (+) para agregar el valor de la variable tiempo al mensaje. Esto significa que el valor de tiempo, que representa el tiempo calculado en segundos*// 

        s.close();//ceramos el scanner
    }
}