package lesson26.hw25;

public class Homework {
    public static void main(String[] args) {
/*        System.out.println(getMeMax(15, 5)); //→ 15
        System.out.println(getMeMax(4, 16)); //→ 16
        System.out.println(getMeMax(20, 100)); //→ 100*/
/*        System.out.println(getMeMin(15, 45));// → 15
        System.out.println(getMeMin(44, 16));// → 16
        System.out.println(getMeMin(200, 100));// → 100*/
/*        System.out.println(myFirstCompareTo("Berlin", "Moscow")); //→ "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow")); //→ "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris")); //→ "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам")); //→ "Могилёв"
        System.out.println(myFirstCompareTo("", "Потсдам")); //→ "Могилёв"*/
    }

    private static String myFirstCompareTo(String word1, String word2) {
/*        char firstLetterFirstWord = word1.charAt(0);
        char firstLetterSecondWord = word2.charAt(0);
        return (firstLetterFirstWord < firstLetterSecondWord) ? word1 : word2;*/
        return (word1.compareToIgnoreCase(word2) < 0) ? word1 : word2;
    }


    private static int getMeMin(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int getMeMax(int a, int b) {
/*        if (a > b) {
            return a;
        } else {
            return b;
        }*/
/*        if (a > b) return a;
        else return b;*/
/*        if (a > b)
            return a;
        else
            return b;*/
        //return Math.max(a, b);
        return (a > b) ? a : b;
    }


}
