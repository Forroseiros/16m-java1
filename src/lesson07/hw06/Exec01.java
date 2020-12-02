package lesson07.hw06;

public class Exec01 {
    //Напишите программу действий кассира магазина,
    // если у него пытаются купить алкоголь следующие
    // 5 покупателей: 10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
    public static void main(String[] args) {
        System.out.println(salesPermission(10));
    }

    private static String salesPermission(int customerAge) {
        String result = "";
        switch (customerAge) {
            case 10:
                result = "продажа алкоголя запрещена";
                break;
            case 17:
                result = "продажа лёгкого спиртного разрешена";
                break;
            case 18:
                result = "продажа всего кроме водки разрешена";
                break;
            case 20:
            case 30:
                result = "продажа разрешена";
                break;
            default:
                result = "ЗИНА!!!!";
                break;
        }
        return result;
    }
}
