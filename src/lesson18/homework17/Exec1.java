package lesson18.homework17;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        //introduceYourSelf();
        //introduceYourSelf2();
        String name = giveMeName();
        int a = 5;
        int b = a + 7;

    }

    private static String giveMeName() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Представьтесь плиз");
        String result = scr.next();
        return result;
    }

    private static void introduceYourSelf2() {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Your age plz!");
        String myTemp = input.next();
        age = Integer.parseInt(myTemp);
        age = input.nextInt();
        System.out.println("Вроде бы получилось - " + age);
    }

    private static void introduceYourSelf() {
        String firstname, secondName, gender, email;
        int age;
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Your age plz!");
        age = inputTemp.nextInt();
        System.out.println("Your firstname plz!?");
        firstname = inputTemp.next();
        System.out.println("Your secondname?");
        secondName = inputTemp.next();
        System.out.println("Your gender?");
        gender = inputTemp.next();
        System.out.println("Your e-mail?");
        email = inputTemp.next();

        System.out.println("Правильно ли я вас понял, что и вам " + age + "лет");
    }
}
