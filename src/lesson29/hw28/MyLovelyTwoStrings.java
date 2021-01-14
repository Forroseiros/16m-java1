package lesson29.hw28;

public class MyLovelyTwoStrings {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); //→ true
        System.out.println(endOther("AbC", "HiaBc")); //→ true
        System.out.println(endOther("abc", "abXabc")); //→ true
        System.out.println(endOther("abcd", "abXabcd")); //→ true
        System.out.println(endOther("abcdf", "sdfdasabXabcd")); //→ false

        System.out.println("Andrej".equalsIgnoreCase("andrej"));
        System.out.println("Andrej".equals("andrej"));
    }

    private static boolean endOther(String word1, String word2) {
        // 1. Узнаем какое слово меньше. Находим минимальную длину.
        // 2. Взять сабстринги обадвух слов с конца
        // 3. Сравнить сабстринги
        int minLength = Math.min(word1.length(), word2.length());
        String etalon1 = word1.substring(word1.length() - minLength);
        String etalon2 = word2.substring(word2.length() - minLength);
        return etalon1.equalsIgnoreCase(etalon2);
    }

    private static boolean endOtherSecond(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return str1.endsWith(str2) || str2.endsWith(str1);
    }
}
