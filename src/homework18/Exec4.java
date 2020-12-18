package homework18;

public class Exec4 {
    public static void main(String[] args) {
        double cost = finalResult();
        System.out.println(cost);
    }

    private static double finalResult() {
        double result
                = materialCost()
                + hardwareCost()
                + workerCost();
        return result;
    }

    private static double workerCost() {
        return 0;
    }

    private static double hardwareCost() {
        return 0;
    }

    private static double materialCost() {
        double result = woodCost() + colorCost();
        return 0;
    }

    private static double colorCost() {
        return 0;
    }

    private static double woodCost() {
        return 0;
    }
}
