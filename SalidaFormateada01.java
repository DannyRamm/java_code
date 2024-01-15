/**
* Salida formateada
*
* @author Danny
*/
public class SalidaFormateada01 {
  public static void main(String[] args) {
     System.out.printf("El número %d no tiene decimales.\n", 32);
     System.out.printf("El número %f sale con decimales.\n", 34.0);
     System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 28.0);
    }
}