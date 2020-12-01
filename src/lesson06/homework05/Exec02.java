package lesson06.homework05;

public class Exec02 {
    public static void main(String[] args) {
        System.out.println(doorBell(true, true));// ->false
        System.out.println(doorBell(false, false));// ->false
        System.out.println(doorBell(true, false));// ->true
    }

    public static boolean doorBell(boolean door1, boolean door2) {
        return door1 ^ door2;
        // return !(door1 == door2);
        // return door1 != door2;
    }
}
