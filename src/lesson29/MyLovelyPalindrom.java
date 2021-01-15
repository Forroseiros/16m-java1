package lesson29;


import java.util.Locale;

public class MyLovelyPalindrom {
    public static void main(String[] args) {
        // "А роза упал на лапу Азора" - >>
        // "pop"  - true
        // "JavaScript"  - > false
        // Решение
        // 1. Привести к одному регистру  // туловер
        // 2. Убрать пробелы. // сложновато, надо писать отельный метод
        // 3. Перевернуть слово или всю фразу / стринг  // есть такой метод
        // 4. Сравнить инпут с аутпутом // equals
        // 5. Вернуть сравнение // return
        //System.out.println(checkPalindrome("А роза упала на лапу Азора")); // -> true
        //System.out.println(checkPalindrome("поп")); //-> true
        //System.out.println(checkPalindrome("школа")); //-> false
        System.out.println(wordReverse("Василий"));
    }

    private static String wordReverse(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = input.charAt(i) + result;
        }
        return result;
    }

    private static boolean checkPalindrome(String word) {
        String input = word;
        // 1. Привести к регистру
        input = input.toLowerCase();
        input = deleteSpace(input);
        String output = wordReverse(input);
        return input.equals(output);
    }


    private static String deleteSpace(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                output = output + input.charAt(i);
            }
        }
        return output;
    }
}
