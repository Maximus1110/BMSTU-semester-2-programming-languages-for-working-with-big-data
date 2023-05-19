public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose(5);

        rose.bloom();
        System.out.println("Роза расцвела");

        rose.wither();
        System.out.println("Роза завяла");

        String budColor = rose.getBudColor();
        System.out.println("Цвет бутона: " + budColor);

        System.out.println("Подробности о розе: " + rose);
    }
}