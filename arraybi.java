public class arraybi {
        public static void main(String[] args) {
            int[][] num = new int[3][6];
    
            num[0][0] = 0;
            num[0][1] = 75;
            num[0][2] = 30;
            num[0][5] = 5;
            num[1][4] = 0;
            num[2][2] = -2;
            num[2][3] = 9;
            num[2][5] = 11;
            System.out.println("Tabla:");
            System.out.println("Fila\tColumna\tValor");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.println(i + "\t\t" + j + "\t\t" + num[i][j]);
                }
            }
        }
    }