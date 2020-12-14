package lesson15;

public class Chess {
    public static void main(String[] args) {
        //chess(8);
        multiplyTable(10);
    }

    private static void multiplyTable(int lines) {
        // 1. Таблица
        // 2. содержимое, произвидение
        // 3. Отформатировать
        for (int i = 1; i <=lines; i++) {
            for (int j = 1; j <= lines; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    private static void chess(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line / 2; j++) {
                System.out.print("*-");
            }
            System.out.println();
        }
    }

}
