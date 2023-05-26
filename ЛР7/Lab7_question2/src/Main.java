import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ввод текста, подстроки и слова для вставки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();
        System.out.print("Введите слово для вставки: ");
        String word = scanner.nextLine();

        // Вызов метода для вставки слова после каждого слова с заданной подстрокой
        String modifiedText = insertWordAfterSubstringEnds(text, substring, word);

        // Вывод результата
        System.out.println("Измененный текст: " + modifiedText);
    }

    public static String insertWordAfterSubstringEnds(String text, String substring, String word) {
        // Используем регулярное выражение для поиска слов, заканчивающихся на заданную подстроку
        String regex = "\\b\\w*" + substring + "\\b";

        // Заменяем каждое найденное слово на слово с вставкой
        String modifiedText = text.replaceAll(regex, "$0 " + word);

        return modifiedText;
    }
}
