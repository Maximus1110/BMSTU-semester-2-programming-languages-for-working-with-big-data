public class Main {
    public static void main(String[] args) {
        House house = new House(3, 2);

        house.lockDoors();
        System.out.println("Двери закрыты");

        System.out.println("Количество окон: " + house.getWindowCount());
        System.out.println("Количество дверей: " + house.getDoorCount());

        System.out.println("Подробности о доме: " + house);
    }
}