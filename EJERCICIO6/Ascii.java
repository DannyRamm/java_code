package EJERCICIO6;

public class Ascii {


        public static void main(String[] args) throws InterruptedException {
          int linea = 0;
          
          System.out.print("\033[32m"); // pinta en verde
          
          for(int i = 0; i < 8000; i++) {
            System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
            
            if (linea++ == 60) {
              linea = 0;
              long tiempoInicio = System.currentTimeMillis();
              long tiempoEspera = 200;
              System.out.println();
              while (System.currentTimeMillis() - tiempoInicio < tiempoEspera) {
            }
          }
        }
      }
    }