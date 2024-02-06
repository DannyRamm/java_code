
import java.util.Scanner;
public class numerosEnteros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Introduce el primer número entero: ");
        int num1 = s.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = s.nextInt();

        System.out.print("Introduce el tercer número entero: ");
        int num3 = s.nextInt();

        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3);
        System.out.println("Números ordenados de menor a mayor: " +
                numerosOrdenados[0] + ", " +
                numerosOrdenados[1] + ", " +
                numerosOrdenados[2]);
        s.close();
    }
    public static int[] ordenarNumeros(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};

    
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        return numeros;
    }
}
