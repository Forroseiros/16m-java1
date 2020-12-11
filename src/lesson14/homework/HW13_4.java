package lesson14.homework;

public class HW13_4 {
    // static double framePrice = 100;
    public static void main(String[] args) {
        double finalPrise = countCost(8, 4, 180, 175);
        System.out.println("Итого " + finalPrise);

    }

    private static double countCost(int doors,
                                    int windows,
                                    double high,
                                    double wide) {
        return doorsPrice(doors) + windowsPrise(windows, high, wide);
    }

    private static double windowsPrise(int windows,
                                       double high,
                                       double wide) {
        double meterHigh = high / 100;
        double meterWide = wide / 100;
        double framePrice = 100;
        double glassPrice = 100;
        double perimeter = (meterWide + meterHigh) * 2;
        double area = meterWide * meterHigh;
        return (perimeter * framePrice + area * glassPrice) * windows;
    }

    private static double doorsPrice(int doors) {
        double doorsMeterPrice = 120.0;
        double a = 2.0;
        double b = 0.9;
        double perimeter = (a + b) * 2;
        double area = a * b;
        double framePrice = 100;

        return (perimeter * framePrice + area * doorsMeterPrice) * doors;
    }
}
