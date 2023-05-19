import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> holidays;

    public Calendar() {
        holidays = new ArrayList<>();
    }

    public void addHoliday(int day, int month, String name) {
        Holiday holiday = new Holiday(day, month, name);
        holidays.add(holiday);
    }

    public void printHolidays() {
        System.out.println("Праздничные и выходные дни:");
        for (Holiday holiday : holidays) {
            System.out.println(holiday);
        }
    }

    private class Holiday {
        private int day;
        private int month;
        private String name;

        public Holiday(int day, int month, String name) {
            this.day = day;
            this.month = month;
            this.name = name;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%d.%d - %s", day, month, name);
        }
    }
}
