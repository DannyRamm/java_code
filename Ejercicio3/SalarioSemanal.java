package Ejercicio3;

import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
  
        final double TARIFA_HORA = 12.0;


        Scanner s = new Scanner(System.in);

 
        System.out.print("Ingresa las horas trabajadas en la semana: ");
        double horasTrabajadas = s.nextDouble();


        double salarioSemanal = TARIFA_HORA * horasTrabajadas;


        System.out.println("El salario semanal del empleado es: " + salarioSemanal + " soles");
    }
}
