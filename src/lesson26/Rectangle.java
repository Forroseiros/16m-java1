package lesson26;


public class Rectangle {
    public static void main(String[] args) {
        // lineDraw(15, "+");
        //lineDraw(5, "*");
        //lineDraw(3, "-");
        rectangle(5, 7, "%");
        всёСложно();
    }

    private static void всёСложно() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void rectangle(int x, int y, String myLovelySymbol) {
        for (int i = 0; i < y; i++) {
            lineDraw(x, myLovelySymbol);
        }
    }


    public static void lineDraw(int x, String symbol) {
        for (int i = 0; i < x; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
