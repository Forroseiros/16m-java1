package homework16;


public class Exec1 {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8)); // → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
        System.out.println(makeBricks(3, 2, 9));// → false
    }

    private static boolean makeBricks(int smalBox, int bigBox, int goal) {
        return smalBox + bigBox * 5 == goal || smalBox == goal || bigBox * 5 == goal;
    }
}
