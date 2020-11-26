package lesson04.HW03;

public class Exercise01 {
    public static void main(String[] args) {
        // 1. Написать программу для вычисления площади круга.
        System.out.println("Результат у клиента" + circleArea(15));
    }

    public static double circleArea(int radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("распечатка для прогера при дебаге" + area);
        return area;
    }

    public static void circleAreaFirstVersion() {
        double pi = 3.14;
        double radius = 15.5;
        double area = pi * radius * radius;
        System.out.println(area);
    }

}
