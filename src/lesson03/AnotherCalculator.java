package lesson03;

public class AnotherCalculator {
    public static void main(String[] args) {
        //additionThree(5, 78);
        //System.out.println(additionThree(5, 78));
        int result = additionThree(2342,2453);
        System.out.println(result);
    }

    public static int additionThree(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static int additionFour(int a, int b) {
        return a + b;
    }
}

