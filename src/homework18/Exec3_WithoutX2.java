package homework18;

public class Exec3_WithoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi")); //→ "Hi"
        System.out.println(withoutX2("Hxi")); //→ "Hi"
        System.out.println(withoutX2("Hi")); //→ "Hi"
    }

    private static String withoutX2(String input) {
        String output = input.substring(2);
        if (input.charAt(0) == 'x' && input.charAt(1) == 'x') {
            return output;
        } else if (input.charAt(0) == 'x') {
            return input.charAt(1) + output;
        } else if (input.charAt(1) == 'x') {
            return input.charAt(0) + output;
        } else {
            return input;
        }
    }

    private static String withoutX2Second(String input) {
        //if(input.substring(0,2).equals("xx"))
        if (input.charAt(0) == 'x' && input.charAt(1) == 'x') {
            return input.substring(2);
        } else if (input.charAt(0) == 'x') {
            return input.substring(1);
        } else if (input.charAt(1) == 'x') {
            return input.substring(0, 1) + input.substring(2);
        } else {
            return input;
        }
    }
}
