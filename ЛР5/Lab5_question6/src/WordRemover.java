import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WordRemover {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Путь к входному файлу
        String outputDirectoryPath = "output"; // Путь к директории для вывода результатов
        String outputFilePath = outputDirectoryPath + "/output.txt"; // Путь к файлу вывода результатов

        try {
            List<String> lines = Files.readAllLines(Path.of(inputFilePath));

            List<String> processedLines = new ArrayList<>();
            for (String line : lines) {
                String[] words = line.split("\\s+");
                int evenWordCount = 0;

                for (String word : words) {
                    if (word.length() >= 3 && word.length() <= 5) {
                        evenWordCount++;
                    }
                }

                int removeCount = evenWordCount % 2 == 0 ? evenWordCount : evenWordCount - 1;
                String processedLine = removeWords(line, removeCount);
                processedLines.add(processedLine);
            }

            createOutputDirectory(outputDirectoryPath);
            writeLinesToFile(outputFilePath, processedLines);

            System.out.println("Обработка файла завершена. Результаты сохранены в файле " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String removeWords(String line, int count) {
        String[] words = line.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() < 3 || word.length() > 5 || count <= 0) {
                sb.append(word).append(" ");
            } else {
                count--;
            }
        }

        return sb.toString().trim();
    }

    private static void createOutputDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    private static void writeLinesToFile(String filePath, List<String> lines) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String line : lines) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }
        }
    }
}
