package lesson24;

import lesson20.Main;

public class SuperTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{7, 4, 6, 2};
        Main.printArrayForEach(Hw23.makeEnds(arr1));
        Main.printArrayForEach(Hw23.makeEnds(arr2));
        Main.printArrayForEach(Hw23.makeEnds(arr3));
        maxEnd3Test();// → [3, 3, 3]
/*        maxEnd3Test();// → [11, 11, 11]
        maxEnd3Test();// → [3, 3, 3]*/
        int[] var1 = new int[0];
        int[] barr = new int[]{4, 5, 6};
        Main.printArrayForEach(Hw23.makeLast(barr));
    }

    private static void maxEnd3Test() {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        int[] testArray1 = new int[]{3, 3, 3};
        int[] testArray2 = new int[]{11, 11, 11};
        int[] testArray3 = new int[]{3, 3, 3};

        if (testArray1[0] == Hw23.maxEnd3(arr1)[0] &&
                testArray1[1] == Hw23.maxEnd3(arr1)[1] &&
                testArray1[2] == Hw23.maxEnd3(arr1)[2]) {
            System.out.println("Тест №118 прошёл успешно");
        } else {
            System.out.println("Тест №118 провален");
        }
    }
}
