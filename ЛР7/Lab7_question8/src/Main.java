import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Исходный текст
        String text = "Hello world, how are you today?";

        // Вызов метода для вывода слов в алфавитном порядке
        printWordsInAlphabeticalOrder(text);
    }

    public static void printWordsInAlphabeticalOrder(String text) {
        // Разделение текста на слова
        String[] words = text.split("\\s+");

        // Сортировка слов в алфавитном порядке
        Arrays.sort(words);

        // Вывод отсортированных слов
        for (String word : words) {
            System.out.println(word);
        }
    }
}
