package lesson22.hw21;

public class HomeWork0401 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};

        printArrayForEachColorful(midThree(a1));// → [2, 3, 4]
        printArrayForEachColorful(midThree(a2));// → [7, 5, 3]
        printArrayForEachColorful(midThree(a3));// → [1, 2, 3]
    }

    private static int[] midThree(int[] input) {
        int[] output = new int[3];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        output[2] = input[input.length / 2 + 1];
        return output;
    }


    public static void printArrayForEachColorful(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 1) {
                System.out.print(Color.ANSI_RED + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 2) {
                System.out.print(Color.ANSI_WHITE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 3) {
                System.out.print(Color.ANSI_BLUE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 4) {
                System.out.print(Color.ANSI_YELLOW + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 5) {
                System.out.print(Color.ANSI_PURPLE + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 6) {
                System.out.print(Color.ANSI_CYAN + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 7) {
                System.out.print(Color.ANSI_BLACK + array[i] + "," + Color.ANSI_RESET);
            } else if (array[i] % 10 == 8) {
                System.out.print(Color.ANSI_GREEN + array[i] + "," + Color.ANSI_RESET);
            } else {
                System.out.println(Color.ANSI_BLACK + array[i] + "," + Color.ANSI_RESET);
            }
        }
        System.out.println();
    }
}
