package lesson30.hw29.kkubb;

/*Написать свой метод проверки строки на палиндром.
Учесть, что палиндром может быть предложением с пробелами.
При решении задачи используйте цикл.
Нельзя использовать методы replace(), reverse() и конструкции, которые вы не учили.
checkPalindrom( "А роза упала на лапу Азора") -> true
checkPalindrom( "поп") -> true
checkPalindrom( "школа") -> false
 */

public class HWpalindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));
        System.out.println(checkPalindrom("поп"));
        System.out.println(checkPalindrom("школа"));
    }

    public static boolean checkPalindrom(String str) {
        String output = getStringWithoutSpace(str);
        String temp = reverseString(str);
        return output.equals(temp);
    }

    private static String getStringWithoutSpace(String str) {
        String input = "";
        str = str.toLowerCase();
        char[] temp = str.toCharArray();
        for (int j = 0; j < str.length(); j++) {
            if (Character.isLetter(str.charAt(j))) {
                input += temp[j];
            }
        }
        return input;
    }

    public static String reverseString(String str) {
        String output = "";
        str = getStringWithoutSpace(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        return output;
    }
}
