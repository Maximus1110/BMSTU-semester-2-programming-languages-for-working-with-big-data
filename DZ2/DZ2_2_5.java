import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = 5 ;
        if ( args.length > 0 ){
            n = Integer.parseInt( args[0]);
            
        }
        
        int[][] matrix = new int[50][50];

        for ( int i =0; i < n; i++){
            for ( int j =0; j < n; j++){

                matrix[i][j] = rand.nextInt(100);
                System.out.format("%2s ",matrix[i][j]);

            }
            System.out.println();
        }

        for ( int i =0; i < n; i++){
            for ( int j =n-1; j > i; j--){

                int buff = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buff;

            }
        }

        System.out.println();

        for ( int i =0; i < n; i++){
            for ( int j =0; j < n; j++){

                System.out.format("%2s ",matrix[i][j]);

            }
            System.out.println();
        }

    }
}