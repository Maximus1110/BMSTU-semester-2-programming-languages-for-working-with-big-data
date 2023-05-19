import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание объекта магазина
        Shop shop = new Shop();

        // Добавление отделов
        shop.addDepartment("Электроника");
        shop.addDepartment("Одежда");
        shop.addDepartment("Косметика");

        // Добавление товаров в отделы
        shop.addProductToDepartment("Электроника", "Телевизор");
        shop.addProductToDepartment("Электроника", "Смартфон");
        shop.addProductToDepartment("Одежда", "Футболка");
        shop.addProductToDepartment("Одежда", "Джинсы");
        shop.addProductToDepartment("Косметика", "Помада");
        shop.addProductToDepartment("Косметика", "Лосьон");

        // Добавление услуг в отделы
        shop.addServiceToDepartment("Электроника", "Установка и настройка");
        shop.addServiceToDepartment("Одежда", "Примерка");
        shop.addServiceToDepartment("Косметика", "Консультация по уходу");

        // Вывод информации о всех отделах
        shop.printDepartments();
    }
}




