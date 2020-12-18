package lesson18.homework17;

import java.util.Scanner;

public class GuessGame {

    public static void game() {
        int range = customerRange();
        int attempts = customerAttempts();
        int secretComputerNumber = generateDigit(range);

        // Выиграл, если в указанное количество попыток он угадал.
        // Проиграл, если попытки закончились, а он не угадал.

        int countAttempts = 0;
        System.out.println("Давай начнём игру!");
        //         while (number!=digit){
        int customerNumber;
        Scanner scr = new Scanner(System.in);
        customerNumber = scr.nextInt();
        while (customerNumber != secretComputerNumber) {
            System.out.println();
            System.out.println(compare(customerNumber, secretComputerNumber));
            System.out.println("Введите число снова");
            customerNumber = scr.nextInt();
            countAttempts++;
            if (attempts == countAttempts) {
                attemptsDone(countAttempts);
            }
        }
        System.out.println("Игра закончена, спасибо!");
    }

    private static String compare(int customerNumber, int secretComputerNumber) {
        if (customerNumber == secretComputerNumber) {
            return "Вы угадали";
        } else if (customerNumber > secretComputerNumber) {
            return "ваше число больше загаданного";
        } else {
            return "ваше число меньше загаданного";
        }
    }

    private static void attemptsDone(int countAttempts) {
        System.out.println("Игра закончена вы проиграли, использовано " + countAttempts + "попыток");
    }

    private static int customerAttempts() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Я рекомендую для диапазона от нуля до ста не менее пяти попыток.");
        System.out.println("За сколько попыток ты хочешь отгадать моё число?");
        return scr.nextInt();
    }

    public static int generateDigit(int diapason) {
        return (int) (Math.random() * diapason);
        //(max-min)+1+min
    }

    private static int customerRange() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Скажи нам кастомер число в диапазоне которого я должен загадать своё число.");
        return scr.nextInt();
        // return 10;
    }
}
