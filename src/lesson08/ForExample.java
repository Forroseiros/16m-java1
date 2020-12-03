package lesson08;

public class ForExample {
    public static void main(String[] args) {
        example01();
    }

    private static void example01() {
        int a = 3;
        for (int i = 1; i < 10; i++) {
            a++;
            System.out.println("А что это у нас происходит");
        }
        System.out.println(a);
    }
}
