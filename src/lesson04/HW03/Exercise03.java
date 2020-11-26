package lesson04.HW03;

public class Exercise03 {
    public static void main(String[] args) {
        // Написать формулу вычисления стоимости Евро,
        // если курс Евро к Доллару 1,1.
        int dollarsClients = 900;
        System.out.println("при переданных "
                + 1000
                + "Долларов" + " клиент получит"
                + currencyConverter(dollarsClients, 1.1));
    }

    public static double currencyConverter(double dollars, double rate) {
        double euro = dollars / rate;
        return euro;
    }
}
