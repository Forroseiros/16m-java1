package lesson18;

public class MyLovelyRound {
    public static void main(String[] args) {
        //roundIntro();
    }

    private static void roundIntro() {
        double pi = Math.PI;
        // 3 цифры после запятой
        double tempPi = pi * 1000;
        System.out.println(tempPi);
        int magicInt = (int) tempPi;
        System.out.println(magicInt);
        pi = (double) magicInt / 1000;
        System.out.println(pi);
    }
}
