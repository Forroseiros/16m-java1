package lesson21;

import lesson20.Main;

public class ArrayExc02 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{7, 1, 2, 3, 4, 9};
        int[] a3 = new int[]{1, 2};

        Main.printArrayForEach(makeMiddle(a1));//[2, 3]
        Main.printArrayForEach(makeMiddle(a2));// [2, 3]
        Main.printArrayForEach(makeMiddle(a3));//[1, 2]
    }

    public static int[] makeMiddle(int[] input) {
        int[] output = new int[2];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        return output;
    }
}
