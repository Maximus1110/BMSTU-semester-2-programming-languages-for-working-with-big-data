public class Main {
    public static void main(String[] args) {
        // Текст
        String text = "This is the first sentence. Here is another one. And a third.";

        // Вызов метода для замены слов в предложениях
        String result = swapFirstAndLastWordInSentences(text);

        // Печать результата
        System.out.println(result);
    }

    public static String swapFirstAndLastWordInSentences(String text) {
        // Регулярное выражение для разделения текста на предложения
        String sentenceRegex = "(?<=\\.|\\?|!)\\s+";

        // Регулярное выражение для разделения предложений на слова
        String wordRegex = "\\s+";

        // Разделение текста на предложения
        String[] sentences = text.split(sentenceRegex);

        // Замена слов в каждом предложении
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];

            // Разделение предложения на слова
            String[] words = sentence.split(wordRegex);

            if (words.length > 1) {
                // Замена первого и последнего слова
                String temp = words[0];
                words[0] = words[words.length - 1];
                words[words.length - 1] = temp;
            }

            // Объединение слов обратно в предложение
            String newSentence = String.join(" ", words);
            sentences[i] = newSentence;
        }

        // Объединение предложений обратно в текст
        return String.join(" ", sentences);
    }
}
