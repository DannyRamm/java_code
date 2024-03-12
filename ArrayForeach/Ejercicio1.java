package ArrayForeach;

public class Ejercicio1 {
    public static void main(String[] args) {
        //para no tener erorres con los indecis de un arreglo usaremos la estructura ForEach
        double[] notas = new double[4];

        System.out.println("Para calcular la nota media necesito saber\n la nota de cada examen");
        for (int i = 0; i < notas.length; i++){
            System.out.print("nota n º "+(i+1)+":");
            notas[i] = Double.parseDouble(System.console().readLine());

        }
        double suma = 0;
        for ( double n : notas) {
            System.out.print(n +" ");
            suma = suma +n;

    
        }
        System.out.println("\nE1 promedio es: "+suma/4);
    }

}
