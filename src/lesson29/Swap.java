package lesson29;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int temp = b;  // temp = 4
        b = a;  // b = 5;
        a = temp;  // a = 4;
        System.out.println(a);
        System.out.println(b);
    }
}
