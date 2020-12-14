package lesson15;

public class LoopForExercise {

    // for i
    // while
    // do while

    public static int multiplySecond(int a, int b) {
        // for i  -
        int result = 0;
        for (int count = 0; count < b; count++) {
            result = result + a;
        }
        return result;
    }

    public static int multiplyThree(int a, int b) {
        // while
        // сначала думаем, потом делаем
        // Kopfschleife
        int result = 0;
        int count = 0;
        while (count < b) {
            result = result + a;
            count++;
        }
        return result;
    }

    public static int multiply(int a, int b) {
        // do while
        // сначала делаем и только потом думаем
        // Fußschleife

        int result = 0;
        int count = 0;
        do {
            result = result + a;
            count++;
        } while (count < b);
        return result;
    }

    public static void myInt() {
        int a = 6;
        a = a + 7;
        a = a + 4;
        a = a + 9;
    }

    public static void draw(int number) {

    }
}
