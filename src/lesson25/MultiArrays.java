package lesson25;


public class MultiArrays {
    public static void main(String[] args) {
        int[][][][][] myLovelyArr = new int[5][][][][];
        //intro();
        //intro2();
        //intro3();
        //intro4();
        intro5();
    }

    private static void intro5() {
        //int[] arr
    }

    private static void intro4() {
        int[][] example = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5},
        };
        printTwoIntArray(example);
    }

    private static void printTwoIntArray(int[][] input) {
        for (int[] myLineArray : input) {
            for (int lineElement : myLineArray) {
                System.out.print(lineElement + " ");
            }
            System.out.println();
        }
    }

    private static void intro3() {
        int[][] var = new int[5][]; // двумерный массив с заданными ПЯТЬЮ строками
        var[0] = new int[1];
        var[1] = new int[2];
        var[2] = new int[3];
        var[3] = new int[4];
        var[4] = new int[5];

        for (int[] myLineArray : var) {
            for (int lineElement : myLineArray) {
                System.out.print(lineElement + " ");
            }
            System.out.println();
        }
    }

    private static void intro2() {
        int[][][] arr = new int[5][10][1000];
        int[] myLovelyArray = {1, 2, 3, 4, 5};
        byte[][][] byteArray = {
                {
                        {0, 1, 2},
                        {0, 1, 2},
                        {3, 4, 5},
                },
                {
                        {0, 1, 2},
                        {0, 1, 2},
                        {3, 4, 5},
                },
        };
    }

    private static void intro() {
        String[][] myArray = new String[5][3];

        myArray[0][0] = "1";
        myArray[0][1] = "Матвеев";
        myArray[0][2] = "№0934573409";

        myArray[1][0] = "2";
        myArray[1][1] = "Сидоров";
        myArray[1][2] = "№304597340";

        myArray[2][0] = "3";
        myArray[2][1] = "Васечкин";
        myArray[2][2] = "№543646";

        myArray[3][0] = "4";
        myArray[3][1] = "Петечкин";
        myArray[3][2] = "№4565467";

        myArray[4][0] = "5";
        myArray[4][1] = "Иванов";
        myArray[4][2] = "№56475687";
        printTwoDStringArray(myArray);
    }

    private static void printTwoDStringArray(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "  \t");
            }
            System.out.println();
        }
    }

}
