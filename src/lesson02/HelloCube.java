package lesson02;

public class HelloCube {
    public static void main(String[] args) {
        // Дан куб со стороной 10;
        // Найдите площадь и периметр;
        //int a = 10;
        findPerimeter();
        findSquare();
    }

    public static void findPerimeter() {
        int a = 10;
        int perimeter = 12 * a;
        System.out.println("периметр куба равен: " + perimeter);
    }

    public static void findSquare() {
        int a = 10;
        int quadratSquare = a * a;
        int cubeSquare = 6 * quadratSquare;
        System.out.println("площадь куба равен: " + cubeSquare);
    }
}
