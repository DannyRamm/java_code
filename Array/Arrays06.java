package Array;

public class Arrays06 {
    public static void main(String[] args) {
    /*
     * Escribe un programa que llene un array de 100 elementos con numeros enteros aleatorios entre 0 y 500
     * A continuacion el programa mostrara el array y preguntara al usuario si quiere destacar el maximo
     * o minimo, seguidamente se volvera a mostrar el array escribiendo el numero destacado entre dobles asteriscos
     * **min**
     * **max**
     */

     int[] numero = new int[100];
     int maximo = 0;
     int minimo = 100;

        
     for (int i = 0; i < 100; i++) {
        numero[i] = (int)(Math.random() * 501);
            if (numero[i] < minimo) {
                minimo = numero[i];
            } 
            if(numero[i] > maximo) {
                maximo = numero[i];
                }
            }    
            for (int elemento : numero) {
                System.out.print(elemento +" ");
            }
    System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int opcion = Integer.parseInt(System.console().readLine());
}
}