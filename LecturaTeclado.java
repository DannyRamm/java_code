public class LecturaTeclado {
    public static void main(String[] args) {
        /*
         * lectura de texto
         * System.console().readLine().
         * 
         */
        String nombre;
        System.out.println("Por favor dime como te llamas:");
        nombre = System.console().readLine();
        System.out.println("hola " + nombre + ",bienvenido!!!!");

    }
}
