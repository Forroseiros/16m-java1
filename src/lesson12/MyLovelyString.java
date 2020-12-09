package lesson12;

public class MyLovelyString {
    public static void main(String[] args) {
        // exampleOne();
        // exampleTwo();
        exampleThree();
    }

    private static void exampleThree() {
        String hm = "Schwаrzneger";
        String newHm = hm.replace('e', 'Я');
        System.out.println(newHm);
    }

    static void exampleTwo() {
        String hm = "Schwаrzneger";
        System.out.println(hm.codePointAt(4));  // 97
        String euroSymbol = "€";
        System.out.println(euroSymbol.codePointAt(0)); // 8364
        int magicDigits = 8364;
        char euroSym = (char) magicDigits;
        System.out.println(euroSym);
        System.out.println(hm.codePointBefore(4));
    }

    protected static void exampleOne() {
        // charAt
        String hm = "Schwarzneger";
        System.out.println(hm.charAt(3));
        System.out.println(hm.charAt(hm.length() - 3));
        char firstLetter = hm.charAt(0);
        char lastLetter = hm.charAt(hm.length() - 1);
        System.out.println("" + firstLetter + lastLetter);
        int magicInt = firstLetter + lastLetter;

        String magicString = "" + firstLetter + lastLetter;
        String magicString2 = String.valueOf(firstLetter + lastLetter);
        String magicString3 = "";
        magicString3 += firstLetter + lastLetter;
        String magicString4 = "";
        magicString4 += firstLetter;

        int test = 5 + 4 * 7 / 10;
        System.out.println(magicString);
        System.out.println(magicString2);
        System.out.println(magicString3);

        String nomerDoma = "№15";
        String nomerDoma1 = "15";
    }
}
