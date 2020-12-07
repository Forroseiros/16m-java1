package lesson10;

public class HomeWorkExample {
    // Напишите программу,
    // которая проверяет год на високосность.
    // Кратный четырём.
    public static void main(String[] args) {
/*        System.out.println(leapYear(2020)); // true
        System.out.println(leapYear(2021)); // false
        System.out.println(leapYear(1995)); // false*/

        // Напишите программу, которая находит числа кратные 11
        // между a и b.
        System.out.println(modulo11(12));
        System.out.println(modulo11(11));
        checkModulo11AandB(10, 100);
    }

    private static void checkModulo11AandB(int a, int b) {
        for (int i = a; i < b ; i++) {
            if (modulo11(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean modulo11(int number) {
        return number % 11 == 0;
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0;
    }
}
