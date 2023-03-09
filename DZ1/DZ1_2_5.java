public class Main
{
	public static void main(String[] args) {
        int[] values = new int[30];
        int n = args.length;
        for( int i =0; i< n; i++){

            values[i] = Integer.parseInt(args[i]);

        }

        for( int j =0; j< n-1; j++){
            for( int i =0; i< n-j-1; i++){

                if( Math.abs( values[i+1] ) > Math.abs( values[i] ) ){
                    int buff = values[i+1];
                    values[i+1] = values[i];
                    values[i] = buff;
                }
                
            }
        }

        for( int i =0; i< n; i++){

            System.out.format("%s ",values[i]);

        }
	}
}