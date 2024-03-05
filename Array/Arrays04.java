package Array;

public class Arrays04 {
    public static void main(String[] args) {
        /*vamos a crear un programa que genera 100 numeros aleatorios del 0 al 20, los
         * mostraremos en pantalla separados por espacios, el programa pedira que ingrese dos valores por teclado y a continuacion el programa cambiara el primer por el segundo
         */
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random() * 21);
            System.out.print(numeros[i]+ " - ");
        }

        System.out.print("\nIngrese un numero de lo que se ha mostrado: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese un valor para reemplazar: ");
        int valor2 = Integer.parseInt(System.console().readLine());
            String verde = "\033[32m";
            String blanco = "\033[37m";

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
                System.out.print(verde + numeros[i]+" - ");
            } 
            else{
                System.out.print(blanco + numeros[i]+" - ");
            }    
        }
    }
}