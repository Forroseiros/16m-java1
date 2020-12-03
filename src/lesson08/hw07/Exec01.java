package lesson08.hw07;

public class Exec01 {
    public static void main(String[] args) {
        int speed = 140;
        speedControl(speed);
    }

    private static void speedControl(int speed) {
        if (speed <= 50) {
            System.out.println("нарушений нет");
        } else if (speed <= 65) {
            System.out.println("Предупреждение");
        } else if (speed < 100) {
            System.out.println("штраф 40€");
        } else if (speed < 130) {
            System.out.println("штраф 500€");
        } else {
            System.out.println("Кара господня");
        }
    }
}
