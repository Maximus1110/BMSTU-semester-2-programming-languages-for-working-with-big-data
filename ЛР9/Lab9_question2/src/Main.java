import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("apple", "banana", "orange", "grape");

        String result = collection.stream()
                .collect(Collectors.joining(":"));

        System.out.println(result);
    }
}
