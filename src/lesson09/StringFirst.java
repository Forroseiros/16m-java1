package lesson09;

public class StringFirst {
    public static void main(String[] args) {
       /* System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice")); //→ "Hello Alice!"
        System.out.println(helloName("X")); //→ "Hello X!"
        System.out.println(helloName("Tel-Ran")); //→ "Hello Tel-Ran!"
        */

       /* System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
         */

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere")); //→ "Hello"
        System.out.println(firstHalf("abcdef")); //→ "abc"
    }

    private static String firstHalf(String input) {
        int half = input.length() / 2;
        return input.substring(0, half);
    }

    private static String makeOutWord(String out, String word) {
        String result = out.substring(0, 2) + word + out.substring(2);
        return result;
    }

    private static String helloName(String name) {
        String result = " Hello " + name + '!';
        return result;
    }


}
