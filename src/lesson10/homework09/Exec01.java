package lesson10.homework09;

public class Exec01 {
    public static void main(String[] args) {
        // 1. Ничего непонятно. Неродной
        // 2. Модуло
        // 3. Математика
        // Верни true, если заданное неотрицательное число больше 1 или 2,
        // кратному 20.
        /* System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
        System.out.println(more20(85));// → false
        System.out.println(more20(101));// → true*/

        System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true
    }

    private static boolean nearTen(int num) {
        return num % 10 < 3 || num % 10 >= 8;
    }

    private static boolean more20(int number) {
        // 1. Дано
        // 2. Найти
        // 3. Решение
        int temp = number % 20;
        //return temp == 1 || number % 20 == 2;
        return temp > 0 && temp < 3;
    }
}
