package lesson07.hw06;

public class Exec02 {
    public static void main(String[] args) {
        int month = 122;
        System.out.println(findSeason(month));
        // scope -> Область видимости
    }

    private static String findSeason(int monthNumber) {
        String season = "";
        switch (monthNumber) {
            case 11:
            case 10:
            case 9:
                season = "Осень";
                break;
            case 8:
            case 7:
            case 6:
                season = "Лето";
                break;
            case 5:
            case 4:
            case 3:
                season = "Весна";
                break;
            case 2:
            case 1:
            case 12:
                season = "Зима";
                break;
            default:
                season = monthNumber + " не существует";
        }
        return season;
    }
}
