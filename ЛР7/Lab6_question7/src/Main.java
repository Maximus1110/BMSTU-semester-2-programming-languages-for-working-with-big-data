public class Main {
    public static void main(String[] args) {
        // Исходный текст
        String text = "Hellooo, how areeee youuuu?";

        // Вызов метода для замены повторяющихся символов
        String processedText = replaceRepeatedCharacters(text);

        // Печать обработанного текста
        System.out.println(processedText);
    }

    public static String replaceRepeatedCharacters(String text) {
        StringBuilder processedText = new StringBuilder();

        // Цикл по символам в тексте
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Добавление текущего символа в обработанный текст, если он отличается от предыдущего символа
            if (i == 0 || currentChar != text.charAt(i - 1)) {
                processedText.append(currentChar);
            }
        }

        return processedText.toString();
    }
}
