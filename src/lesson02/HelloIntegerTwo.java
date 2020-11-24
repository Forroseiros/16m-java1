package lesson02;

public class HelloIntegerTwo {
    public static void main(String[] args) {
        // helloInt();
        //helloByte();
        //helloShort();
        magicNumber();
    }

    public static void magicNumber() {
        int hexValue = 0x100;
        int binary = 0B1001_1001;
        int octal = 0757;
    }

    public static void helloShort() {
        short a = 23_4_32;
        short b = 2423;
        short c = (short) (a + b);
    }

    public static void helloByte() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        byte d = 120;
        byte f = 10;
        byte e = (byte) (d + f); // ошибка
        System.out.println(e);
    }

    public static void helloInt() {
        int a = 9;
        System.out.println("ожидаю 9: " + a);
        System.out.println("не ожидаю шесть: " + a);
        int b = 5;
        System.out.println(a + b); //  ожидаю 14
        System.out.println(a * b); // ожидаю 45
        System.out.println(a / b);
        // ожидаю 2.8 ; 3; одна с чемто
        System.out.println(a - b);  // ожидаю 4
    }

}
