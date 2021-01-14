package lesson29.hw28;

import java.util.Arrays;

public class MyLovelyPi {
    public static void main(String[] args) {
        String piToPrint = Arrays.toString(makePi());
        System.out.println(piToPrint);
    }

    private static int[] makePi() {
        //int[] result = new int[]{3, 1, 4};
        int[] result = new int[3];
        result[0] = 3;
        result[1] = 1;
        result[2] = 4;
        return result;
    }
}
