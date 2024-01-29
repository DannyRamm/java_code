
import java.util.Scanner;

public class LeerDatosScanner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ingresa tu nombre y edad, separados por un espacion:  ");
        String nombre = s.next();
        int edad = s.nextInt();
        System.out.println("Tu nombre es: "+nombre+" y tu edad es "+edad);
        }
}