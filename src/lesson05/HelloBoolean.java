package lesson05;

public class HelloBoolean {
    public static void main(String[] args) {
        // reviewInt();
        boolean a = true;
        boolean b = false;
        // boolean c = 1;
        boolean c = a && b;
        System.out.println(c);
        System.out.println(a || b);
        System.out.println(!a);
        boolean d = !a;
        boolean f = a ^ b;
        System.out.println(f);
    }

    public static void reviewInt() {
        int a = 5;
        int b = a;
        System.out.println(a);
        a = 7;
        a = 10;
        b = a;
        System.out.println(a);
    }
}

