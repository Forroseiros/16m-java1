package lesson17;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("А сикока цибе лет?: ");
        age = input.nextInt();
        System.out.println("А как цибья завут!!??");
        String customerName;
        customerName = input.next();
        System.out.println("А ты уверен " + customerName + " что тебе " + age + " лет?");
    }
}
