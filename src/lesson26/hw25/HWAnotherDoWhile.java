package lesson26.hw25;

/**
 * Java-m1-16m
 * 11 11 : 29
 */
public class HWAnotherDoWhile {
    public static void main(String[] args) {
        findBandA(5, 17);
    }

    private static void doNotUseForTwo(int a, int b) {
        do {
            System.out.println(a);
            ;
            a++;
        } while (a < b);
    }

    private static void findBandA(int a, int b) {
/*        int number = a;
        do {
            System.out.println(number);
            number++;
        } while (number <= b);*/
        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }
    }
}
