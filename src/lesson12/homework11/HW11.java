package lesson12.homework11;

public class HW11 {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));  //→ "Fizz"
        System.out.println(fizzString("dib"));  //→ "Buzz"
        System.out.println(fizzString("fib"));  //→ "FizzBuzz"
        System.out.println(fizzString("sdkjfhsdaölk"));  //→ "sdkjfhsdaölk"


    }

    private static String fizzString(String str) {
        boolean magicString3 = str.startsWith("f") && str.endsWith("b");
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }

    private static String fizzStringUno(String str) {
        // 1. Отсеять те кто начинается с "f" и заканчивается на "b"
        // 2. Отсеять те кто начинается ПРОСТО с "f"
        // 3. Отсеять те кто ПРОСТО заканчивается на "b"
        // 4. Всё остальное
        // String , int, char, double, boolean
        int lastLetter = str.length() - 1;
        if (str.substring(0, 1).equals("f")
                && str.substring(str.length() - 1).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.substring(lastLetter).equals("b")) {
            return "Buzz";
        }
        return str;
    }
}
