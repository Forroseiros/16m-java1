package lesson30.hw29;

public class MyLovelyPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("А роза упала на лапу Азора")); // -> true
        System.out.println(checkPalindrome("поп")); //-> true
        System.out.println(checkPalindrome("школа")); //-> false
        // 1. Перевер
    }

    private static boolean checkPalindrome(String word) {
        return word.equals(reverse(word));
    }

    private static String reverse(String word) {
        String output = "";


        return output;
    }
}
