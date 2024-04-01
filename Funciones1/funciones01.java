package Funciones1;

public class funciones01 {
    public static void main(String[] args) {
/*funciones: una porcion de codigo que realiza
una tarea especifica

*/   
System.out.println("ingrese un numero positivo:  ");
int n = Integer.parseInt(System.console().readLine());

boolean esPrimo = true;
for (int i = 2; i < n; i++){
    if ((n % i) == 0){
        esPrimo = false;
    }
}
if (esPrimo){
    System.out.println(" El " + n + " es primo");}
    else {
        System.out.println( "El"  + n +  " no es primo" );

     }
    }

    public static boolean esPrimo(int n){
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    } 
