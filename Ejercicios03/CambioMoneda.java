package Ejercicios03;

import java.util.Scanner;

public class CambioMoneda {
          public static void main(String[] args) {
            final double TIPO_CAMBIO = 4.1061367;
    
            Scanner s = new Scanner(System.in);
    
            System.out.print("Ingresa la cantidad de euros: ");
            double euros = s.nextDouble();
    
            double soles = euros * TIPO_CAMBIO;
    
            System.out.println(euros + " Euros equivalen a " + soles + " Soles.");

            s.close();
            
        }
    }