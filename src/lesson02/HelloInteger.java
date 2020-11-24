package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        //helloInt();
        helloLong();
    }

    public static void helloLong() {
        System.out.println("А здесь мы рассмотрим - long");
        long al = 23543245;
        int test = 23543245;
        long bl = 2389473__2_0_5L;
        long cl = 43_298_472_034L;
        long sum = al + bl;
        System.out.println(sum);
    }

    public static void helloInt() {
        int a = 5;
        int b = 3;
        //int leftButtonUserLogin;
        int c = a + b;
        // definition
        // !!!declaration!!!
        // initialization

        int x;
        x = 7;
        int d, f, g, h, j, k, l;
        d = x;
        l = 5;
        System.out.println("Это моё а " + a);
        System.out.println("А это моё c " + c);
    }
}

