import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.print("Ingrese tres números, separados por espacio: ");
        double numero1 = d.nextDouble();
        double numero2 = d.nextDouble();
        double numero3 = d.nextDouble();
        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("La media aritmética de los tres números es: " + media);
        d.close();
    }
}
