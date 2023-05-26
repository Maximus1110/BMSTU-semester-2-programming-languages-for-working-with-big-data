import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Текст
        String text = "apple banana cherry orange lemon lime";

        // Вызов метода для печати слов с совпадающими первой и последней буквами
        printWordsWithSameFirstAndLastLetter(text);
    }

    public static void printWordsWithSameFirstAndLastLetter(String text) {
        // Регулярное выражение для проверки совпадения первой и последней буквы
        String regex = "\\b(\\w)(\\w*)\\1\\b";

        // Создание паттерна и множества для хранения уникальных слов
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Set<String> uniqueWords = new HashSet<>();

        // Поиск и добавление уникальных слов
        while (matcher.find()) {
            String word = matcher.group();
            uniqueWords.add(word);
        }

        // Печать уникальных слов
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
