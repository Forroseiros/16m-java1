package lesson11.hw10;

public class Homework10 {
    public static void main(String[] args) {
        //Дано число меньше 3000.
        // При делении числа на 32 получается остаток 30,
        // при делении на 58 - остаток 44.
        // Найдите число или числа.
        findMagicNumbers();
        split();
        System.out.println(leapYear(2000)); // true
        System.out.println(leapYear(2020)); // true
        System.out.println(leapYear(1800)); // false
        System.out.println(leapYear(2021)); // false
        split();
        System.out.println("Чётные числа");
        System.out.println(giveMeEvenNumber(3));
        System.out.println(giveMeEvenNumber(2));
        split();
        System.out.println(giveMeOddNumber(11));
        split();
    }
        //  !DA
    private static boolean giveMeEvenNumber(int number) {
        if(number ==0){
            return false;
        }
        return number % 2 == 0;
    }
    private static boolean giveMeOddNumber(int number) {
        return !giveMeEvenNumber(number);
    }

    private static boolean leapYearSecond(int year) {
        return year % 400 == 0
                || (year % 4 == 0 ^ year % 100 == 0);
    }

    private static boolean leapYear(int year) {
        return year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0);
    }

    private static boolean leapYearOne(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    private static void split() {
        System.out.println("---------------");
    }

    private static void findMagicNumbers() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }
}
