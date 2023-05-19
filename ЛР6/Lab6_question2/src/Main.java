import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Добавление элементов в список
        numbers.add(3);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(-2);
        numbers.add(4);
        numbers.add(-6);

        System.out.println("Исходный список: " + numbers);

        int left = 0; // Указатель, двигающийся с начала списка
        int right = numbers.size() - 1; // Указатель, двигающийся с конца списка

        while (left < right) {
            if (numbers.get(left) >= 0) {
                // Если элемент положительный, переходим к следующему элементу
                left++;
            } else if (numbers.get(right) < 0) {
                // Если элемент отрицательный, переходим к предыдущему элементу
                right--;
            } else {
                // Если левый элемент положительный, а правый отрицательный, меняем их местами
                int temp = numbers.get(left);
                numbers.set(left, numbers.get(right));
                numbers.set(right, temp);
                left++;
                right--;
            }
        }

        System.out.println("Список после перестановки: " + numbers);
    }
}
