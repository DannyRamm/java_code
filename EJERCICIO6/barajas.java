package EJERCICIO6;

public class barajas {
 public static void main(String[] args) {
              
    String palo = "";
    String carta = "";
              
    int numeroPalo = (int)(Math.random()*4) + 1;
              
    switch(numeroPalo) {// evualamos la variable que identifica los casos
        case 1:
    palo = "picas";
    break;
        case 2:
    palo = "corazones";
    break;
        case 3:
    palo = "diamantes";
    break;
        case 4:
    palo = "tréboles";
    default: // nos permite definir métodos y que estos pertenezcan a las clases que queramos.
              }
          
              int numeroCarta = (int)(Math.random()*13) + 1;
              
              switch(numeroCarta) {
                case 1:
                  carta = "As";
                  break;
                case 11:
                  carta = "J";
                  break;
                case 12:
                  carta = "Q";
                  break;
                case 13:
                  carta = "K";
                  break;
                default:
                  carta = String.valueOf(numeroCarta);
              }
              
              System.out.println(carta + " de " + palo);
            }
          }
