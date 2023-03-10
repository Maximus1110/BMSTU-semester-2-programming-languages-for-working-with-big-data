import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = 5 ;
        
        if ( args.length > 0 ){
            n = Integer.parseInt( args[0]);
            
        }
        
        int[][] matrix = new int[50][50];
        int line_max = 0;
        
        for ( int i =0; i < n; i++){

            int line_sum=0;

            for ( int j =0; j < n; j++){

                matrix[i][j] = rand.nextInt(100);
                line_sum = line_sum + Math.abs(matrix[i][j]);
                System.out.format("%2s ",matrix[i][j]);

            }

            if ( line_sum > line_max ){ line_max = line_sum;}
            System.out.println();

        }


        System.out.format("\n%s",line_max);

        

    }
}