package homework16;

public class Exec3 {
    public static void main(String[] args) {
        multiplicationTable(3);
    }

    private static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + (i * number));
        }
    }
}
