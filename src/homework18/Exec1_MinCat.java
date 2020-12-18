package homework18;

public class Exec1_MinCat {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi")); //→"loHi"
        System.out.println(minCat("Hello", "java")); //→"ellojava"
        System.out.println(minCat("java", "Hello")); //→"javaello"
        System.out.println(minCat("java", "bier")); //→"javabier"
        intReview();
    }

    private static void intReview() {
        int a1 = 5;
        int b1 = 10;
        int minLengthString = Math.min(a1, b1);
        /* if (a1 > b1) {
            minLengthString = b1;
        } else {
            minLengthString = a1;
        }*/
    }

    private static String minCat(String a, String b) {
        int minLengthString = Math.min(a.length(), b.length());
        String first = a.substring(a.length() - minLengthString);
        String second = b.substring(b.length() - minLengthString);
        return first + second;
    }
}
