package lesson27;


public class MyLovelyIndexOf {
    public static void main(String[] args) {
        String hm = "Василий";
        int magicNumber = hm.indexOf("с", 4);
        //System.out.println(magicNumber);
        String prefix = "abc";
        String word = "abcxyabc";
        System.out.println(word.indexOf(prefix,1));
    }
}
