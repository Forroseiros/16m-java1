package lesson13.homework12;

import lesson12.MyColor;

public class TestHomeWork {
    public static void main(String[] args) {
        System.out.println(MyColor.ANSI_BLUE + "text" + MyColor.ANSI_RESET);
        System.out.println(MyColor.ANSI_RED
                + MyColor.ANSI_BLACK_BACKGROUND
                + "sfsdf");

    }
}
