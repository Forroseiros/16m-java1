package lesson10;

public class MyLovelyMath {
    public static int myMin(int a, int b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        myMin(4,5);
    }
}
