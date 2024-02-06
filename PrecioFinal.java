import java.util.Scanner;

public class PrecioFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = scanner.nextDouble();


        System.out.print("Introduzca el tipo de IMPUESTO (general, reducido o superreducido): ");
        scanner.nextLine(); 
        String tipoImpuesto = scanner.nextLine();


        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.nextLine();

        double impuesto;
        switch (tipoImpuesto) {
            case "general":
                impuesto = baseImponible * 0.21;
                break;
            case "reducido":
                impuesto = baseImponible * 0.10;
                break;
            case "superreducido":
                impuesto = baseImponible * 0.04;
                break;
            default:
                System.out.println("Tipo de impuesto no válido.");
                return;
        }


        double precioConImpuesto = baseImponible + impuesto;

      
        double descuento;
        switch (codigoPromocional) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = precioConImpuesto / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioConImpuesto * 0.05;
                break;
            default:
                System.out.println("Código promocional no válido.");
                return;
        }

        double precioFinal = precioConImpuesto - descuento;

        System.out.println("\nBase imponible: " + baseImponible);
        System.out.println("IMPUESTO (" + (tipoImpuesto.equals("general") ? "21" : tipoImpuesto.equals("reducido") ? "10" : "4") + "%): " + impuesto);
        System.out.println("Precio con IMPUESTO: " + precioConImpuesto);
        System.out.println("Cód. promo. (" + codigoPromocional + "): " + (-descuento));
        System.out.println("TOTAL: " + precioFinal);
    }
}