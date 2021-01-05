package lesson22.hw21;

import lesson20.Main;

public class HomeWork21Color {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        System.out.print(ANSI_PURPLE);
        Main.printArrayForEach(midThree(a1));//[2, 3, 4]
        System.out.print(ANSI_RED);
        Main.printArrayForEach(midThree(a2));//[7, 5, 3]
        System.out.print(ANSI_BLUE);
        Main.printArrayForEach(midThree(a3));//[1, 2, 3]

    }

    public static int[] midThree(int[] input) {
        int[] output = new int[3];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        output[2] = input[input.length / 2 + 1];


        return output;
    }

}
