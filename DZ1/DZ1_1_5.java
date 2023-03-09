public class Main
{
	public static void main(String[] args) {
        int sum = 0;
        int prod = 1;
        for ( int i = 0; i<args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
            prod = prod * Integer.parseInt(args[i]);
        }
        if ( args.length > 0 ){
            System.out.format("Cумма:%s Произведение:%s", sum, prod);
        } else {
            System.out.println("Аргументы не введены");
        }
	}
}