package lesson22;

import lesson20.Main;

public class MajicArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 8, 1, 3};
        int x = 99;
        int index = arr.length / 2;
        //  int[] var1 = insertFirstElement(arr, x);

        //Main.printArrayForEach(insertFirstElement(arr, x));
        // Main.printArrayForEach(insertLastElement(arr, x));
        //Main.printArrayForEach(insertSpecificIndexElement(arr, x, index));
        // Main.printArrayForEach(updateSpecificElement(arr, x, index));
        Main.printArrayForEach(deleteElement(arr, index));
    }

    public static int[] deleteElement(int[] input, int index) {
        int[] output = new int[input.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = input[i + 1];
        }
        return output;
    }

    public static int[] updateSpecificElement(int[] input, int element, int index) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        output[index] = element;
        return output;
    }

    public static int[] insertSpecificIndexElement(int[] input, int element, int index) {
        int[] output = new int[input.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < input.length; i++) {
            output[i + 1] = input[i];
        }
        return output;
    }

    public static int[] insertFirstElement(int[] input, int element) {
        int[] output = new int[input.length + 1];
        output[0] = element;
        for (int i = 0; i < input.length; i++) {
            output[i + 1] = input[i];
        }
        return output;
    }

    public static int[] insertLastElement(int[] input, int element) {
        int[] output = new int[input.length + 1];
        output[output.length - 1] = element;
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];

        }
        return output;
    }
}
