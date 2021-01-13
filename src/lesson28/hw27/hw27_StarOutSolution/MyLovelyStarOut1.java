package lesson28.hw27.hw27_StarOutSolution;

public class MyLovelyStarOut1 {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); //→ "ad"
        System.out.println(starOut("ab**cd")); //→ "ad"
        System.out.println(starOut("sm*eilly")); //→ "silly"
        System.out.println(starOut("*sm***eilly*")); //→ "silly"
    }

    private static String starOut(String input) {
        String output = "";
        char star = '*';

        // 1. шаг
        if (input.charAt(0) != star && input.charAt(1) != star) {
            output += input.charAt(0);
        }

        // 2 шаг
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) != star &&
                    input.charAt(i - 1) != star &&
                    input.charAt(i + 1) != star) {
                output += input.charAt(i);
            }
        }
        // 3 шаг
        if (input.charAt(input.length() - 1) != star &&
                input.charAt(input.length() - 2) != star) {
            output += input.charAt(input.length() - 1);
        }
        return output;
    }


}
