package homework16;

public class Exec5 {
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
/*            result = result + giveMeChar(97, 122);
            result = result + giveMeChar('0', '9');
            result = result + giveMeChar('!', '%');*/
            result = result + verySmartGiveMeChar();
        }
        return result;
    }

    private static String verySmartGiveMeChar() {
        String input = "abcdefgdioqwrwqeoimekrwj0123456789!§%&/()$№абсдфеволёксёдфоевопфвефв";
        String output = "";
        int random = (int) (Math.random() * input.length());
        output = output + input.substring(random, random + 1);
        return output;
    }

    private static String giveMeChar(int min, int max) {
        String result = "";
        char myChar = (char) (Math.random() * (max - min) + 1 + min);
        //result = String.valueOf(myChar);
        result = "" + myChar;
        return result;
    }
}
