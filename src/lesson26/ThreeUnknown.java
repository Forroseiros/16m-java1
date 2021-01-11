package lesson26;

public class ThreeUnknown {
    public static void main(String[] args) {
        magicVariable();
        // нужно написать алгоритм вывода на экран всех возможных комбинаций
        // 3-х натуральных чисел до 36 с определенными условиями:
    }

    private static void magicVariable() {
        for (int x = 1; x <= 36; x++) {
            for (int y = 1; y <= 36; y++) {
                for (int z = 1; z <= 36; z++) {
                    if (x * y * z == 36 && y >= x && z >= y) {
                        System.out.print("x = " + x);
                        System.out.print(", y = " + y);
                        System.out.print(", z = " + z);
                        System.out.println();
                    }
                }
            }
        }
    }

    private static void magicVariableOne() {
        for (int x = 1; x <= 36; x++) {  //x= 1
            for (int y = x; y <= 36; y++) { //y = 2
                for (int z = y; z <= 36; z++) {  // z ot 1 до 36
                    if (x * y * z == 36) {
                        System.out.print("x = " + x);
                        System.out.print(", y = " + y);
                        System.out.print(", z = " + z);
                        System.out.println();
                    }
                }
            }
        }
    }
}
