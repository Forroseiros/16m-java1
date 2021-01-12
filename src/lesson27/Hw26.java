package lesson27;
// idea
// eclipse
// netbeans
// visual studio code

public class Hw26 {
    public static void main(String[] args) {
/*        System.out.println(countCode("aaacodebbb")); // → 1
        System.out.println(countCode("codexxcode")); //→ 2
        System.out.println(countCode("cozexxcope")); //→ 2
        System.out.println(countCode("cozexxcopa")); //→ 2
        System.out.println(countCode("cozexxcopaco")); //→ 2*/
        System.out.println(bobThere("abcbob")); //→ true
        System.out.println(bobThere("b9b")); //→ true
        System.out.println(bobThere("bac"));  //→ false
        System.out.println(bobThere("sdgfdsbab"));  //→ true
    }

    private static boolean bobThere(String word) {
        //return input.contains("bob") || input.charAt(0) == 'b' && input.charAt(2) == 'b';
        int count = 0;
        boolean contain = false;
        for (int i = 0; i < word.length() - 2; i++) {
            if ('b' == word.charAt(i) && 'b' == word.charAt(i + 2)) {
                count++;
                contain = true;
            }
        }
        return contain; //count > 0;
    }

    private static int countCode(String word) {
        int count = 0;
        String pattern = "code";
/*        i++;  i = i+1;
        i+1;*/
        for (int i = 0; i < word.length() - 3; i++) {
            // if('c' == word.charAt(i))
            if (word.charAt(i) == 'c'
                    && word.charAt(i + 1) == 'o'
                    && word.charAt(i + 3) == 'e') {
                // count++;
                //count = count + 1;
                count += 1;
                //++count; Нет
            }
        }
        return count;
    }
}
