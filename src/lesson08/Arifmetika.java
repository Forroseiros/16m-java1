package lesson08;

public class Arifmetika {
    public static void main(String[] args) {
       // myDecrementation();
       // myIncrementation();
        myMagicJava();
    }

    private static void myIncrementation() {
        // синтаксический сахар
        int a = 5;
        a = a + 10; //15
        a += 10; // 25
        a++;  // a= a+1;  26
        ++a;  // никогда не использовать
    }

    public static void myDecrementation() {
        int a = 10;
        a = a - 1;
        a -= 1;
        a--;
        System.out.println(a);
    }

    public static void myMagicJava() {
        int a = 10;
        a= a *2;
        a *= 2;
        System.out.println(a);
    }
}