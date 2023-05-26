import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ввод текста, позиции k и подстроки для вставки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        System.out.print("Введите позицию k: ");
        int k = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после ввода числа
        System.out.print("Введите подстроку для вставки: ");
        String substring = scanner.nextLine();

        // Вызов метода для вставки подстроки
        String modifiedText = insertSubstringAfterKthCharacter(text, k, substring);

        // Вывод результата
        System.out.println("Измененный текст: " + modifiedText);
    }

    public static String insertSubstringAfterKthCharacter(String text, int k, String substring) {
        if (k < 0 || k >= text.length()) {
            throw new IllegalArgumentException("Позиция k выходит за пределы текста");
        }

        StringBuilder sb = new StringBuilder();

        // Добавляем все символы до позиции k
        sb.append(text, 0, k);

        // Добавляем подстроку после позиции k
        sb.append(substring);

        // Добавляем оставшиеся символы текста
        sb.append(text.substring(k));

        return sb.toString();
    }
}
