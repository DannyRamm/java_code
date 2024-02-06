import java.util.Scanner;

public class horoscopo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa determina el horóscopo a partir del día y el mes de nacimiento.");

        System.out.print("Por favor, introduzca el día de nacimiento (1-31): ");
        int dia = s.nextInt();

        System.out.print("Ahora introduzca el mes de nacimiento (1-12): ");
        int mes = s.nextInt();

        String horoscopo = determinarHoroscopo(dia, mes);
        System.out.println("Tu horóscopo es: " + horoscopo);
    }

    public static String determinarHoroscopo(int dia, int mes) {
        String[] horoscopos = {"Capricornio", "Acuario", "Piscis", "Aries", "Tauro", "Géminis",
                                "Cáncer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario"};
        int[] limites = {20, 19, 20, 20, 21, 21, 22, 23, 23, 23, 22, 21};

        if (dia > limites[mes - 1]) {
            mes = (mes % 12) + 1;
        }
        return horoscopos[mes - 1];
    }
}