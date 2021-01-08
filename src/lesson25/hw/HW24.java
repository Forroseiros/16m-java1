package lesson25.hw;

import lesson20.Main;

public class HW24 {
    public static void main(String[] args) {
        int[] var1 = new int[]{4, 5};
        int[] var2 = new int[]{1, 2, 3};
        int[] var3 = new int[]{4};
        int[] var4 = new int[]{1, 2, 3};
        int[] var5 = new int[0];
        int[] var55 = new int[]{};
        // int var57[] = new int[]{};
        int[] var6 = new int[]{1, 2};
        int[] var7 = new int[0];
        int[] var8 = new int[0];
        int[] var9 = new int[0];
        int[] var10 = new int[]{10};
        Main.printArrayForEach(make2(var1, var2));
        Main.printArrayForEach(make2(var3, var4));
        Main.printArrayForEach(make2(var5, var6));
        Main.printArrayForEach(make2(var7, var8));
        Main.printArrayForEach(make2(var9, var10));
    }

    private static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length >= 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else if (b.length == 0) {
            return result;
        } else if (b.length == 1) {
            result[0] = b[0];
        } else {
            result[0] = b[0];
            result[1] = b[1];
        }
        return result;
    }
}
