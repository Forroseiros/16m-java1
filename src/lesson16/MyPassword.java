package lesson16;

public class MyPassword {
    public static void main(String[] args) {
        // сделать 20 паролей
        // big (O)
        // 1. Надо сделать символ
        // 2. Надо сделать пароль
        // 3. Надо повторить операцию требуемое количество раз
/*        System.out.println(giveMeChar(97, 122));
        System.out.println(giveMeChar('a', 'z'));
        System.out.println(giveMePass(20));*/
        nTimesPassGenerate(20);
    }

    public static void nTimesPassGenerate(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(giveMePass(10));
        }
    }

    private static String giveMePass(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + giveMeChar(97, 122);
        }
        return result;
    }

    private static String giveMeChar(int min, int max) {
        String result = "";
        char myChar = (char) (Math.random() * (max - min) + 1 + min);
        //result = String.valueOf(myChar);
        result = "" + myChar;
        return result;
    }
}
