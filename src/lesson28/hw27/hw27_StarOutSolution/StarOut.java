package lesson28.hw27.hw27_StarOutSolution;

public class StarOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); //→ "ad"
        System.out.println(starOut("ab**cd")); //→ "ad"
        System.out.println(starOut("sm*eilly")); //→ "silly"
    }

    private static String starOut(String input) {
        String output = "";
        char star = '*';
        if (input.charAt(0) != star && input.charAt(1) != star) {
            output += input.charAt(0);
        }
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) != star && input.charAt(i - 1) != star && input.charAt(i + 1) != star) {
                output += input.charAt(i);
            }
        }
        if (input.charAt(input.length() - 1) != star && input.charAt(input.length() - 2) != star) {
            output += input.charAt(input.length() - 1);
        }
        return output;
    }


}
