import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataIdentifier {
    public static void main(String[] args) {
        String filePath = "data.txt"; // Путь к входному файлу
        String dataType = "integer"; // Тип данных, вводимый из командной строки

        try {
            createOutputDirectoryIfNeeded(); // Создание директории для вывода результатов

            File inputFile = new File(filePath);
            File outputFile = new File("output/results.txt");

            List<String> identifiedData = identifyData(inputFile, dataType);
            writeDataToFile(outputFile, identifiedData);

            System.out.println("Результаты сохранены в файле: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createOutputDirectoryIfNeeded() {
        File outputDirectory = new File("output");
        if (!outputDirectory.exists()) {
            outputDirectory.mkdir();
        }
    }

    private static List<String> identifyData(File inputFile, String dataType) throws IOException {
        List<String> identifiedData = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (isDataType(word, dataType)) {
                        identifiedData.add(word);
                    }
                }
            }
        }

        return identifiedData;
    }

    private static boolean isDataType(String data, String dataType) {
        switch (dataType) {
            case "character":
                return data.length() == 1;
            case "word":
                return data.matches("[a-zA-Z]+");
            case "integer":
                return data.matches("-?\\d+");
            case "floating-point":
                return data.matches("-?\\d+\\.\\d+");
            default:
                return false;
        }
    }

    private static void writeDataToFile(File outputFile, List<String> data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String item : data) {
                writer.write(item);
                writer.newLine();
            }
        }
    }
}
