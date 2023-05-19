import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("apple","anaconda", "banana", "orange", "grape");

        Map<Character, List<String>> result = collection.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(result);
    }
}
