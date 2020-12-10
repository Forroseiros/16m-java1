package lesson13;

public class Exc01 {
    public static void main(String[] args) {
        costOfElectricity(300);//70
        costOfElectricity(90);//30
    }
    private static void costOfElectricity(int kvt) {
        //Дано: 1 квт = 0,20
        //1 мес = 30
        //100 квт ??
        double monthCost = 30;
        if (kvt > 100) {
            monthCost += (kvt - 100) * 0.2;
        }
        System.out.println(monthCost);
    }
}
