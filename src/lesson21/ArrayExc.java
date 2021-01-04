package lesson21;

import lesson20.Main;

public class ArrayExc {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{2, 3, 5};
        int[] a3 = new int[]{1, 2, 1};

        Main.printArrayForEach(fix23(a1));//[1, 2, 0]
        Main.printArrayForEach(fix23(a2));//[2, 0, 5]
        Main.printArrayForEach(fix23(a3));//[1, 2, 1]
    }

    public static int[] fix23(int[] input) {
        if (input[0] == 2 && input[1] == 3) {
            input[1] = 0;
        } else if (input[1] == 2 && input[2] == 3) {
            input[2] = 0;
        }
        return input;
    }
}
