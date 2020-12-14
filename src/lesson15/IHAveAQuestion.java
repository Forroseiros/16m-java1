package lesson15;

public class IHAveAQuestion {
    public static void main(String[] args) {
        System.out.println(digitPow(6));
    }

    private static int digitPow(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            result += number;  // result = result + number
        }
        return result;
    }
}
