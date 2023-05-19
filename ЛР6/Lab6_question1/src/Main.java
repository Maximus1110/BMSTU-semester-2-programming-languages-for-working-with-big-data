import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание списков коэффициентов для двух многочленов
        List<Integer> poly1 = new ArrayList<>();
        List<Integer> poly2 = new ArrayList<>();

        // Заполнение списков коэффициентов
        poly1.add(2);
        poly1.add(3);
        poly1.add(1);

        poly2.add(1);
        poly2.add(2);
        poly2.add(1);

        // Получение степени многочлена
        int degree = poly1.size() - 1;

        // Создание списка для хранения результирующего многочлена
        List<Integer> result = new ArrayList<>();

        // Умножение многочленов
        for (int i = 0; i <= degree * 2; i++) {
            // Инициализация коэффициента результирующего многочлена
            result.add(0);

            // Вычисление нового коэффициента результирующего многочлена
            for (int j = 0; j <= i; j++) {
                if (j <= degree && (i - j) <= degree) {
                    result.set(i, result.get(i) + (poly1.get(j) * poly2.get(i - j)));
                }
            }
        }

        // Вывод результирующего многочлена
        System.out.println("Результат умножения многочленов:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Коэффициент для x^" + i + ": " + result.get(i));
        }
    }
}

