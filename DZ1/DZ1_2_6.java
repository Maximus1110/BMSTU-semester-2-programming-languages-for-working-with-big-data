public class Main
{
	public static void main(String[] args) {
        int[] values = new int[30];
        int n = args.length;
        for( int i =0; i< n; i++){
            int num = Integer.parseInt(args[i]);
            if ( num / 1000 == 0 && num % 10 != num / 10 % 10 &&
                    num /100 % 10 != num / 10 % 10 && num % 10 != num / 100 % 10 ){
                System.out.format("%s ",num);
            }

        }
	}
}
