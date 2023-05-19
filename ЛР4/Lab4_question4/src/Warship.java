// Абстрактный класс Warship, реализующий интерфейс Ship
abstract class Warship implements Ship {
    private String name;

    public Warship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Методы отправки в плавание и стоянки, общие для всех военных кораблей
    public void sail() {
        System.out.println(getName() + " отправился в плавание.");
    }

    public void dock() {
        System.out.println(getName() + " пришвартовался.");
    }
}
