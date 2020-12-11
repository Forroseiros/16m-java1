package lesson14.homework;

public class HW13_2 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars")); //→"ls"
        System.out.println(lastChars("yo", "java")); //→"ya"
        System.out.println(lastChars("hi", "")); //→"h@"
        System.out.println(lastChars("", "")); //→"h@"
    }

    private static String lastChars(String a, String b) {
        String x = a;
        String y = b;
        if (x.length() == 0) {
            x = "@";
        }

        if (y.length() == 0) {
            y = "@";
        }
        String firstLetterFirstWord = x.substring(0, 1);
        String lastLetterLastWord = y.substring(y.length() - 1);
        return firstLetterFirstWord + lastLetterLastWord;
    }
}
