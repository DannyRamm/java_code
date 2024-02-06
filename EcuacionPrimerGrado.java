import java.util.Scanner;

public class EcuacionPrimerGrado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = s.nextDouble();
        
        System.out.print("Ahora introduzca el valor de b: ");
        double b = s.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("Esa ecuación no tiene solución real.");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
        s.close();
    }
}