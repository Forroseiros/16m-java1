package lesson05.homework04;

/**
 * Java-m1-16m
 * 30 09 : 52
 */
public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay")); // "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo")); // "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); // "[[word]]"
        System.out.println(makeOutWord("!??!дкйхгдсфлкйгх", "Василий")); // "[[word]]"
        String hausmaster = "Василий";
        System.out.println(hausmaster.substring(0, 3));
        System.out.println(hausmaster.substring(5));
        System.out.println(hausmaster.substring(3));
        System.out.println(hausmaster.charAt(3));
    }


    public static String makeOutWord(String out, String word) {
        String result = "";
        result = out.substring(0, 2) + word + out.substring(2);
        return result;
    }
}
