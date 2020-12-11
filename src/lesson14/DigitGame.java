package lesson14;

public class DigitGame {
    public static void main(String[] args) {
        // 456; ->
        // 4+5+6 = 15;
        // 364 -> 13
        // через строку
        System.out.println(myMagicSum(435643));
    }

    private static int myMagicSum(int number) {
        String input = String.valueOf(number);
        System.out.println("Перевили инт в стринг " + input);
        int size = input.length();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int temp = Integer.parseInt(input.substring(0, 1));
            System.out.println("Непонятный инт темп: " + temp);
            sum = sum + temp;
            input = input.substring(1);
        }
        return sum;
    }

    private static int myMagicSumUno(int number) {


        return 0;
    }
}
