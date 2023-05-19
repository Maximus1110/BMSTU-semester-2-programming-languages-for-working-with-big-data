public class Main {
    public static void main(String[] args) {
        Model model = new Model("S10");
        model.call("1234567890"); // Вызов метода call() у объекта модели
        model.sendMessage("9876543210", "Привет!"); // Вызов метода sendMessage() у объекта модели

        // Пример полиморфизма: объект типа Model может быть приведен к типу Mobile
        Mobile mobile = model;
        mobile.call("5555555555"); // Вызов метода call() у объекта типа Mobile (модель)
        mobile.sendMessage("4444444444", "Hello!"); // Вызов метода sendMessage() у объекта типа Mobile (модель)
    }
}
