package Ejercicios03;
import java.util.Scanner;

public class megabytes { 

      public static void main(String[] args) {
                
        final int KB_EN_MB = 1024;
          Scanner s = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de megabytes: ");
        double megabytes = s.nextDouble();
        
        double kilobytes = megabytes * KB_EN_MB;
        System.out.println(megabytes + " Megabytes equivalen a " + kilobytes + " Kilobytes.");
    }
}
        

