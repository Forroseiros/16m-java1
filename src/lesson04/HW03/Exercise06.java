package lesson04.HW03;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println(countMoneyBankApplication(1000, 7));
        System.out.println(countMoneyBankApplication(500, 30));
    }

    public static double countMoneyBankApplication(double money, int years) {
        double interest = 3.5;
        double output;
        //money = 300;
        output = money + (money / 100) * interest * years;
        return output;
    }
}
