package lesson06.homework05;

public class Exec01 {
    public static void main(String[] args) {
        System.out.println(bigBadaBoom(true, true));// -> true
        System.out.println(bigBadaBoom(false, false));//-> false
        System.out.println(bigBadaBoom(true, false));// -> false
        boolean capPermission = true;
        boolean jeanLucPicardPermission = true;

        System.out.println
                (bigBadaBoom
                        (capPermission, jeanLucPicardPermission));// -> false


        int a = 5;
        int b = 7;
        sum(a, b);
        sum(10, 15);
    }

    public static void sum(int x, int y){

    }
    public static boolean bigBadaBoom(boolean firstCap, boolean secondCap) {
        return firstCap && secondCap;
    }
}
