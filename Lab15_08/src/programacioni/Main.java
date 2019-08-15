package programacioni;

public class Main {

    public static void main(String[] args) {

        int [][] matriz = new int[3][3];

        matriz [0][0] = 10;
        matriz [0][1] = 12;
        matriz [0][2] = 14;

        matriz [1][0] = 16;
        matriz [1][1] = 18;
        matriz [1][2] = 20;

        matriz [2][0] = 22;
        matriz [2][1] = 24;
        matriz [2][2] = 26;


        System.out.println("Mostrar como Matriz");

        for (int i = 0; i <matriz.length ; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");


            }

        }


    }
}
