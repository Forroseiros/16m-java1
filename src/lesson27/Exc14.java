package lesson27;

public class Exc14 {
    public static void main(String[] args) {
       /* System.out.println(repeatEnd("Hello", 3));// →"llollollo"
        System.out.println(repeatEnd("Hello", 2));// →"lolo"
        System.out.println(repeatEnd("Hello", 1));// →"o"*/

        System.out.println(prefixAgain("abXYabc", 1));// →true
        System.out.println(prefixAgain("abXYabc", 2));// →true
        System.out.println(prefixAgain("abXYabc", 3));// →false
    }

    private static boolean prefixAgain(String word, int n) {
        String prefix = word.substring(0, n);
        //return word.indexOf(prefix,n)!= -1;
        //return word.substring(n).contains(prefix);

        for (int i = n; i < word.length() - n; i++) {
            if (word.substring(0, n).equals(word.substring(i, i + n))) {
                return true;
            }
        }
        return false;
    }

    private static String repeatEnd(String word, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++) {
            newWord += word.substring(word.length() - n);
        }
        return newWord;


       /* for (int i = word.length()-1; i > word.length()-n ; i--) {
            newWord += word.substring()
        }*/
    }
}