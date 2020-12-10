package lesson13;

public class Exc03Money {
    public static void main(String[] args) {
      /*  System.out.println(currencyConverter(1000, "EUR"));
        System.out.println(currencyConverter(700, "GPB"));
        System.out.println(currencyConverter(500, "RUB"));
        System.out.println(currencyConverter(100, "USD"));*/
        System.out.println(justAsk("GPB", "EUR"));
        System.out.println(justAsk("RUB", "EUR"));
    }
    public static double justAsk(String input, String output){
        double curs = findCourse(input)/findCourse(output);
        return curs;
    }

    public static double currencyConverter(double money, String currencyName) {
        return money * findCourse(currencyName);
    }

    public static double findCourse(String currencyName) {
        double currencyCourse = 0.0;
        switch (currencyName) {
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GPB":
                currencyCourse = 1.33;
                break;
            case "EUR":
                currencyCourse = 1.21;
                break;
            case "RUB":
                currencyCourse = 0.014;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        return currencyCourse;
    }
}
