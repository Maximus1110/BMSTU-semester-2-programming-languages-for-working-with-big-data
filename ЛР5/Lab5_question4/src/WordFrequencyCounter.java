import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "poem.txt"; // Путь к входному файлу
        List<String> targetWords = Arrays.asList("good", "evil", "see"); // Заданный список слов

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Map<String, Integer> wordFrequencyMap = new HashMap<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (targetWords.contains(word)) {
                        int frequency = wordFrequencyMap.getOrDefault(word, 0);
                        wordFrequencyMap.put(word, frequency + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedWordFrequencyList = sortWordFrequencyMap(wordFrequencyMap);

            for (Map.Entry<String, Integer> entry : sortedWordFrequencyList) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Map.Entry<String, Integer>> sortWordFrequencyMap(Map<String, Integer> wordFrequencyMap) {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordFrequencyMap.entrySet());

        sortedList.sort(Map.Entry.comparingByValue());

        return sortedList;
    }
}
