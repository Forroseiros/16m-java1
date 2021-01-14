package lesson29;

public class MyLovelyReverse {
    public static void main(String[] args) {
        // Дано число, переверните его. например 546 -> 645
        System.out.println(simpleNumberReverse(546));  // 645
        System.out.println(simpleNumberReverse(5798));  // 8975
        System.out.println(simpleNumberReverse(123));  // 321
        System.out.println(reverse("А роза упал на лапу Азора"));
    }

    private static int simpleNumberReverse(int number) {
        // 1. Перевести в стринг
        // 2. Просто записать задом наперёд ИСПОЛЬЗУЯ ДЛЯ ЭТОГО ОТДФЕЛЬНЫЙ МЕТОД
        // 3. Перевести в инт и отдать
        String temp = String.valueOf(number); //"546"
        String tempReverse = reverse(temp);   // "645"
        int result = Integer.parseInt(tempReverse);  // 645
        return result;
    }

    // "А роза упал на лапу Азора"
    // "756"
    private static String reverse(String input) {
        // 1. Стринг АУТПУТ
        // 2. Просто поменять местами
        // 3. вернуть
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            // 1. Последняя буква инпута в первую букву оутпута
            output = output + input.charAt(i);
        }
        return output;
    }
}
