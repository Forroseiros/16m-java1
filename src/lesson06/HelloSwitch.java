package lesson06;

public class HelloSwitch {
    /*
    За пятёрку по контрольной в Java - велосипед
    За четвёрку GoPro новая
    За тройку хотя бы не поругают
    За двойку отругают
    За единицу-" Лучше и не спрашивай"
     */
    public static void main(String[] args) {
/*        int оценкаВЧетверти = 1;
        myFirstSwitch(оценкаВЧетверти);*/

/*        int score = 3;
        myFirstSwitch(score);*/
        System.out.println(myFirstSwitch(4));
    }

    public static String myFirstSwitch(int schoolScore) {
        String prize = "";
        // оператор выбора, ключевое слово, конструкт
        switch (schoolScore) {
            case 1:
                prize = "Лучше и не спрашивай";
                break;
            case 2:
                prize = "За двойку отругают";
                break;
            case 3:
                prize = "За тройку хотя бы не поругают";
                break;
            case 4:
                // prize = "За четвёрку GoPro новая";
            case 5:
                prize = "За пятёрку по контрольной в Java - велосипед";
                break;
            default:
                prize = "Такой оценки не существует";
                break;
        }
        return prize;
    }
}
