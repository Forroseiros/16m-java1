package lesson27;


public class Exec12_2UP {
    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3)); //→ 6
        System.out.println(noTeenSum(2, 13, 1)); //→ 3
        System.out.println(noTeenSum(2, 1, 14)); // → 3
        System.out.println(noTeenSum(2, 1, 15)); // → 18
    }

    private static int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if (a >= 13 && a <= 14 || a >= 17 && a <= 19) {
            a = 0;
        }

        if (b >= 13 && b <= 19 && b != 15 && b != 16) {
            b = 0;
        }

        if (c >= 13 && c <= 14 || c >= 17 && c <= 19) {
            c = 0;
        }
        sum = a + b + c;
        return sum;
    }
}
