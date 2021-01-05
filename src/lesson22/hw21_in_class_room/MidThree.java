package lesson22.hw21_in_class_room;


import lesson22.hw21.MyPrintColorArray;

public class MidThree {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] arr3 = new int[]{1, 2, 3};

        MyPrintColorArray.print(arr3);

/*        myColorPrintIntArray(midThree(arr1)); // → [2, 3, 4]
        myColorPrintIntArray(midThree(arr2)); //→ [7, 5, 3]
        myColorPrintIntArray(midThree(arr3)); //→ [1, 2, 3]*/
    }

    public static void myColorPrintIntArray(int[] input) {
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.print(ANSI_GREEN_BACKGROUND + ANSI_PURPLE + "[ ");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println(input[input.length - 1] + " ]" + ANSI_RESET);
    }

    private static int[] midThree(int[] arr) {
        int[] output = new int[3];
        output[0] = arr[arr.length / 2 - 1];
        output[1] = arr[arr.length / 2];
        output[2] = arr[arr.length / 2 + 1];
        return output;
    }
}

