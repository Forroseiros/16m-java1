package lesson29.hw28;

public class MyVeryLovelyRound {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18)); //   → 60
        System.out.println(roundSum(12, 13, 14)); //→ 30
        System.out.println(roundSum(6, 4, 4)); //→ 10();
        System.out.println(roundSum(15, 23, 48)); //→ 90();
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int num) {
        // 1. Мы должны найти число модуло 10
        // 2. Сравниваем наш результат(остаток от деления) с пятёркой
        // 3. Если наше остатокДеления меньше пяти, от числа отнять три или (остаток от деления)
        // 4. Если больше, то отнимаем наше модуло и прибавляем десять
        int tempModulo = num % 10;
        if (tempModulo < 5) {
            num = num - tempModulo;
        } else {
            num = num - tempModulo + 10;
        }
        return num;
    }
}
