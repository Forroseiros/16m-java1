public class HelloTelRan {
    public static void main(String[] args) {
        getMeCoffee1();
    }

    public static void getMeCoffee1() {
        getMeCoffee2();
        System.out.println("Эй, человек, Принесика мне чаю!");

    }

    public static void getMeCoffee2() {
        System.out.println("Сделать чай");
    }
}