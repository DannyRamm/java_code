public class LeeNumeros {
    public static void main(String[] args) {
    String linea;

    System.out.println("Ingresa un númuero: ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);

    System.out.println("Ingresa otro número: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt(linea);

    int suma = primerNumero + segundoNumero;
    System.out.println("La suma es:" +suma);
    }
}
