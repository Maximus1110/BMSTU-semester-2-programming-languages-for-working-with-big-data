import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        calendar.addHoliday(1, 1, "Новый год");
        calendar.addHoliday(7, 1, "Рождество");
        calendar.addHoliday(8, 3, "Международный женский день");

        calendar.printHolidays();
    }
}
