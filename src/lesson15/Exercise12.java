package lesson15;

public class Exercise12 {
    public static void main(String[] args) {
        printLineNTimes("Hello", 3);
        System.out.println();
        printLineNTimes("Java", 5);
        System.out.println();
        System.out.println(printLineNTimesString("Frontend", 2));
        countdown(5);
        System.out.println();
        System.out.println(digitPowTwo(5));
        System.out.println(digitPowTwo(10));
        System.out.println(digitPowTwo(4));

    }
    public static int digitPowTwo(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + number;
        }
        return result;
    }

    public static void countdown(int number) {
        for (int i = number; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("start");
    }

    public static String printLineNTimesString(String word, int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result = result + word + " ";
        }
        return result;
    }

    public static void printLineNTimes(String word, int number) {
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print(word + " ");
        }
    }
}
