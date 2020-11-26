package lesson04.HW03;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println(giveMeLengthCircle(45.5));
        System.out.println(giveMeLengthCircle(15));
        System.out.println(giveMeLengthCircle(7.8));
        System.out.println(giveMeLengthCircle(18));
    }

    public static double giveMeLengthCircle(double radius) {
        double pi = 3.14;
        double length = 2 * pi * radius;
        return length;
    }

    public static void giveMeLengthCircleSecond(double radius) {
        double pi = 3.14;
        double length = 2 * pi * radius;
        System.out.println(length);
    }
}
