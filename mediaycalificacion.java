import java.util.Scanner;

public class mediaycalificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa calcula la media de tres notas y determina la calificación del boletín.");

        System.out.print("Por favor, introduzca la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ahora introduzca la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Por último, introduzca la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("La media de las tres notas es: " + media);

        if (media >= 1 && media <= 10) {
            System.out.println("Calificación del boletín: insuficiente");
        } else if (media >= 11 && media <= 12) {
            System.out.println("Calificación del boletín: suficiente");
        } else if (media >= 13 && media <= 15) {
            System.out.println("Calificación del boletín: bien");
        } else if (media >= 16 && media <= 20) {
            System.out.println("Calificación del boletín: notable o sobresaliente");
        } else {
            System.out.println("Error: Las notas deben estar en el rango de 1 a 20.");
        }
        scanner.close();
    }
}