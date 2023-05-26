public class Main {
    public static void main(String[] args) {
        // Исходный текст
        String text = "This is a secret message.";

        // Вызов метода для шифрования текста
        String encryptedText = encryptText(text);

        // Печать зашифрованного текста
        System.out.println(encryptedText);
    }

    public static String encryptText(String text) {
        StringBuilder encryptedText = new StringBuilder();

        // Цикл по символам в зашифрованном тексте
        for (int i = 0; i < text.length(); i += 3) {
            // Добавление символа на позиции 1, 4, 7, ...
            if (i < text.length()) {
                encryptedText.append(text.charAt(i));
            }

            // Добавление символа на позиции 2, 5, 8, ...
            if (i + 1 < text.length()) {
                encryptedText.append(text.charAt(i + 1));
            }

            // Добавление символа на позиции 3, 6, 9, ...
            if (i + 2 < text.length()) {
                encryptedText.append(text.charAt(i + 2));
            }
        }

        return encryptedText.toString();
    }
}
