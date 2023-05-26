import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Стихотворение
        String poem = "В полночь, в полночь, в полночь,\n" +
                "В полночь, в полночь, в полночь,\n" +
                "В полночь, в полночь, в полночь,\n" +
                "В полночь, в полночь, в полночь.";

        // Вызов метода для подсчета слов, начинающихся и заканчивающихся гласной буквой
        int count = countWordsWithVowelStartAndEnd(poem);

        // Вывод результата
        System.out.println("Количество слов, начинающихся и заканчивающихся гласной буквой: " + count);
    }

    public static int countWordsWithVowelStartAndEnd(String poem) {
        // Регулярное выражение для проверки начала и конца слова с гласной буквой
        String regex = "\\b[аеёиоуыэюяАЕЁИОУЫЭЮЯ]\\w*[аеёиоуыэюяАЕЁИОУЫЭЮЯ]\\b";

        // Создание паттерна и счетчика
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(poem);
        int count = 0;

        // Подсчет слов, соответствующих условию
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
