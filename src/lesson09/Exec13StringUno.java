package lesson09;

public class Exec13StringUno {
    public static void main(String[] args) {
/*        System.out.println(nonStart("Hello", "There")); //→ "ellohere"
        System.out.println(nonStart("java", "code")); //→ "avaode"
        System.out.println(nonStart("shotl", "java")); //→ "hotlava"
        System.out.println(nonStart("Telran", "")); //→ error*/

        System.out.println(theEnd("Hello", true)); // → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
    }

    private static String theEnd(String word, boolean b) {
        // если б = тру, то тогда верни первую букву, иначе верни последнюю
        String output = "";
        if (b) { // b == true
            //return word.substring(0, 1);
            output = word.substring(0, 1);
        } else {
            // return word.substring(word.length() - 1);
            output = word.substring(word.length() - 1);
        }
        return output;
    }

    private static String nonStart(String str1, String str2) {
        return str1.substring(1) + str2.substring(1);
    }
}
