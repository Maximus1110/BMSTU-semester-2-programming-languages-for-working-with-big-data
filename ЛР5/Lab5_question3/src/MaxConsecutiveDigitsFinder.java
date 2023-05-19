import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MaxConsecutiveDigitsFinder {
    private static final String INPUT_FILE_PATH = "input.txt"; // Путь к входному файлу

    public static void main(String[] args) {
        try {
            createInputFileIfNeeded();
            processInputFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createInputFileIfNeeded() throws IOException {
        // Проверяем наличие входного файла
        if (!fileExists(INPUT_FILE_PATH)) {
            System.out.println("Входной файл не найден. Создаем новый файл: " + INPUT_FILE_PATH);
            createNewInputFile();
        }
    }

    private static void createNewInputFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE_PATH))) {
            writer.write("12345"); // Пример строки с цифрами
            writer.newLine();
        }
    }

    private static boolean fileExists(String filePath) {
        return new java.io.File(filePath).exists();
    }

    private static void processInputFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
            String line;
            int maxConsecutiveDigits = 0;

            while ((line = reader.readLine()) != null) {
                int consecutiveDigitsCount = findMaxConsecutiveDigits(line);
                if (consecutiveDigitsCount > maxConsecutiveDigits) {
                    maxConsecutiveDigits = consecutiveDigitsCount;
                }
            }

            System.out.println("Наибольшее число цифр, идущих подряд: " + maxConsecutiveDigits);
        }
    }

    private static int findMaxConsecutiveDigits(String line) {
        int maxConsecutiveDigits = 0;
        int currentConsecutiveDigits = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isDigit(c)) {
                currentConsecutiveDigits++;
                if (currentConsecutiveDigits > maxConsecutiveDigits) {
                    maxConsecutiveDigits = currentConsecutiveDigits;
                }
            } else {
                currentConsecutiveDigits = 0;
            }
        }

        return maxConsecutiveDigits;
    }
}
