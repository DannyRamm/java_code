package EJERCICIO6;

public class Simulacion {
    public static void main(String[] args) {
    
    
            // Presentamos el programa
            System.out.print("\nBienvenido a las tragamonedas, si logras 2 figuras idénticas te reembolsaremos");
            System.out.println(" tu plata, si logras los 3, habrás ganado el premio. ¡good luck!");
            System.out.println("-----------------------------------------------------------------------------");
            int figuras; // Almacena las figuras al azar
            int figura1 = 0; // Almacena la figura 1
            int figura2 = 0; // Almacena la figura 2
            int figura3 = 0; // Almacena la figura 3
            System.out.println();
            
            // Genera 3 figuras al azar
            for (int i = 1; i <= 3; i++) {
              figuras = (int)(Math.random()*5+1);
              
              // Almacena las 3 figuras
              if (i == 1) {
                figura1 = figuras;
              } else if (i == 2) {
                figura2 = figuras;
              } else if (i == 3) {
                figura3 = figuras;
              }
              switch (figuras) {
                case 1:
                  System.out.print("Corazón ");
                  break;
                case 2:
                  System.out.print("Diamante ");
                  break;
                case 3:
                  System.out.print("Herradura ");
                  break;
                case 4:
                  System.out.print("Campana ");
                  break;
                case 5:
                  System.out.print("Limón ");
                  break;
                default:
                  System.out.print("Nada");
              }
            }
            System.out.println("\n---------------------------------------------------------------------------");
            
            // esto Muestra los resultados por pantalla según las condiciones
            if ((figura1 == figura2) && (figura2 == figura3)) {
              System.out.print("\n¡lo lograste, has ganado el premio!, aquí tiene las 10 monedas.");
            } else if ((figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)) {
              System.out.println("\n¡casssi!, casi lo logras, aquí tiene plata de nuevo. En la siguiente tirada tendra mas suerte.");
            } else {
              System.out.print("\njjaja... fuiste pe, pediste no te desanimes, a la siguiente sera...");
            }
          } 
        }