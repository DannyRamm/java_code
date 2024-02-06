import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        final double TARIFA_ORDINARIA = 12.0;
        final double TARIFA_EXTRA = 16.0;
        final int HORAS_ORDINARIAS = 40;

        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = s.nextInt();

        s.close();

        double salarioSemana = 0;

        if (horasTrabajadas <= HORAS_ORDINARIAS) {
            salarioSemana = horasTrabajadas * TARIFA_ORDINARIA;
        } else {
            salarioSemana = HORAS_ORDINARIAS * TARIFA_ORDINARIA + (horasTrabajadas - HORAS_ORDINARIAS) * TARIFA_EXTRA;
        }

        System.out.println("El sueldo semanal que le corresponde es de " + salarioSemana + " soles");
    }
}