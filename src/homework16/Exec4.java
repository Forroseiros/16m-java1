package homework16;

public class Exec4 {
    public static void main(String[] args) {
        printDivisors(32);
    }

    private static void printDivisors(int number) {
        int divisors = 0;
/*        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
                System.out.println(i);
            }
        }*/
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                divisors++;
                System.out.println(i);
            }
        }
        System.out.println("Total divisors:" + divisors);
    }
}
