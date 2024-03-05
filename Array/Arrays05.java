package Array;
//REALICE UN PROGRAMA QUE GENERE 8 NUMEROS ENTEROS ALEATORIOS Y QUE LUEGO MUESTRE ESOS NUMEROS JUNTO
//A LA PALABRA POR O IMPAR SEGUN CORRESPONDA.
public class Arrays05 {
    public static void main(String[] args) {
        int[] numeros = new int[8];

    for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 10);
            System.out.println(numeros[i]);
    }
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 == 0) {
            System.out.println(numeros[i] + " par ");
        }else {
            System.out.println(numeros[i] + " impar ");

             }
        }
    }
}