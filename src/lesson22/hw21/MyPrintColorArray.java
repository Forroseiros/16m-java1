package lesson22.hw21;

public class MyPrintColorArray {
    public static void main(String[] args) {
        int[] a1 = new int[]{};
        print(a1);
    }

    public static void print(int[] output) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        System.out.print(ANSI_RED + '[' + ANSI_RESET);
        for (int i = 0; i < output.length; i++) {
            System.out.print(ANSI_YELLOW_BACKGROUND + ANSI_BLUE + output[i] + "," + ANSI_RESET);
        }
        System.out.println(ANSI_RED + ']' + ANSI_RESET);
    }
}
