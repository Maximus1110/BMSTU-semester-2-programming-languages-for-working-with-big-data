public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Класс Book");
        Book.demonstration(5);
        System.out.println("Класс House");
        House.demonstration(5);
        System.out.println("Класс Matrix");
        Matrix.demonstration(5);
        System.out.println("Класс ContinuedFraction");
        ContinuedFraction.demonstration(5, 5);
    }
}
