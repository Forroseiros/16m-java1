package lesson27;

public class Exec14_1 {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz")); //→ false
        System.out.println(sameStarChar("*xa*az")); //→ true
        System.out.println(sameStarChar("*xa*az*")); //→ true
    }

    private static boolean sameStarChar(String str) {
        char star = '*';
        for (int i = 1; i < str.length() - 1; i++) {
            if (star == str.charAt(i) && str.charAt(i - 1) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
