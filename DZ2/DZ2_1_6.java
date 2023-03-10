public class Main {

    public static void main(String[] args) {
        

        String answer = "''";

        for ( String str: args) {

            boolean flag = true;
            for ( int i = 0; i<str.length()-1; i++){
                if ( str.charAt(i) > str.charAt(i+1)){
                    flag=false;
                    break;
                }
            }

            if ( flag ){
                answer = str;
                break;
            }
        }

        System.out.format(" Подходит слово: %s\n",answer);


    }
}