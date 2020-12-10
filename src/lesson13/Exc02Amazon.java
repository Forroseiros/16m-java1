package lesson13;

public class Exc02Amazon {
    public static void main(String[] args) {
        // Тип А - 200x200x200 мм
        //Тип Б -150x150x150 мм
        // Тип В -250x250x250 мм
        // Тип Г -350x400x500 мм
        // Тип Д -400x400x400 мм
        double basketball = 320;
        double volleyball = 250;
        System.out.println(boxType(volleyball));
        System.out.println(boxType(basketball));
        System.out.println(boxType(100));
        System.out.println(boxType(200));
        System.out.println(boxType(330));
        System.out.println(boxType(500));
    }

    public static String boxType(double ball) {
        ball = ball * 1.05;
        if (ball <= 150) {
            return "Б";
        } else if (ball <= 200) {
            return "A";
        } else if (ball <= 250) {
            return "B";
        } else if (ball <= 350) {
            return "Г";
        } else if (ball <= 400) {
            return "Д";
        } else {
            return "Unknown";
        }
    }
}
