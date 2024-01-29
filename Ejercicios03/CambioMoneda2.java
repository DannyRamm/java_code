package Ejercicios03;

import java.util.Scanner;

public class CambioMoneda2 {
    public static void main(String[] args) {
       
        final double TIPO_CAMBIO = 166.386;

        Scanner s = new Scanner(System.in);

     
        System.out.print("Ingresa la cantidad de pesetas: ");
        double pesetas = s.nextDouble();

        double euros = pesetas / TIPO_CAMBIO;

      
        System.out.println(pesetas + " Pesetas equivalen a " + euros + " Euros.");
    }
}