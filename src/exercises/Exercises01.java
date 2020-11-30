package exercises;

public class Exercises01 {
    public static void main(String[] args) {
        System.out.println("smartDepositBox");
        System.out.println(smartDepositBox(true, false)); // true
        System.out.println(smartDepositBox(false, true)); // true
        System.out.println(smartDepositBox(false, false)); //false
        split();
        System.out.println("smartDepositBoxVersionTwo");
        System.out.println(smartDepositBoxVersionTwo(true, false));
        System.out.println(smartDepositBoxVersionTwo(false, true)); // false
        System.out.println(smartDepositBoxVersionTwo(false, false));// false
        System.out.println(smartDepositBoxVersionTwo(true, true)); //true
    }

    public static boolean smartDepositBoxVersionTwo(boolean mama, boolean papa) {
        return mama && papa;
    }

    public static void split() {
        System.out.println("-------------------");
    }

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        boolean result = mama || papa;
        return result;
        // return mama || papa;
    }

}
