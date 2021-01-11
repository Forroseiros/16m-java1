package lesson26.hw25;


import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        double userW = weightFinder();
        double userH = heightFinder();
        System.out.println("Индекс массы тела пользователя составляет: " + bmiFinder(userW, userH));
    }

    private static double heightFinder() {
        double height;
        System.out.println("Введите рост пользователя, в метрах, например 1.75: ");
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        if (height > 100) height /= 100;
        return height;
    }

    private static double weightFinder() {
        double weight;
        System.out.println("Введите вес пользователя: ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        return weight;
    }

    // вес в килограммах, рост в метрах ->> 55 кг, 1.75 метров
    private static double bmiFinder(double weight, double height) {
        return weight / (height * height);
    }
}
