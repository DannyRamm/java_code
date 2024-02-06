import java.util.Scanner;

public class Dias {

    public static void main(String[] args) {
        String[] diasDeLaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();
        scanner.close();
        
        if (numeroDia >= 1 && numeroDia <= 7) {
            String nombreDia = diasDeLaSemana[numeroDia - 1];
            System.out.println("El nombre del día correspondiente es: " + nombreDia);
        } else {
            System.out.println("Número de día no válido");
        }
    }
}