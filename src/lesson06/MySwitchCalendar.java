package lesson06;

public class MySwitchCalendar {
    public static void main(String[] args) {
        int myUnknownMonth = 15;
        System.out.println(intToStringMonthName(myUnknownMonth));
       // System.out.println(intToStringMonthName(6));
        // https://emmet.io/
    }

    public static String intToStringMonthName(int number) {
/*        String output = "";
        String result = "";*/
        String monthName = "";

        switch (number) {
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            case 4:
                monthName = "Апрель";
                break;
            case 5:
                monthName = "Май";
                break;
            case 6:
                monthName = "Июнь";
                break;
            case 7:
                monthName = "Июль";
                break;
            case 8:
                monthName = "Август";
                break;
            case 9:
                monthName = "Сентябрь";
                break;
            case 10:
                monthName = "Октябрь";
                break;
            case 11:
                monthName = "Ноябрь";
                break;
            case 12:
                monthName = "Декабрь";
                System.out.println("проверка декабря");
                System.out.println("Самый прекрасный месяц в году");
                break;
            default:
                monthName = "такого не существует";
                break;
        }
        return monthName;
    }
}
