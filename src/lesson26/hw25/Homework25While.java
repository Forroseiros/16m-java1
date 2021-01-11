package lesson26.hw25;

public class Homework25While {
    public static void main(String[] args) {
        /* Даны целые числа A и B, где B > 0. Вывести B раз число A.
          Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.*/

        printB_Atimes(3, 10);
    }

    private static void printB_Atimes(int a, int b) {
        // вариант 1
/*        for (int i = 0; i < b; i++) {
            System.out.print(a + " ");
        }*/

        // вариант 2
/*        int i = 1000;
        while (i < b) {
            //i++;
            System.out.print(a + " , и на шаге - " + i);
            i = i + 1;
            System.out.println();
        }*/
        // вариант 3
/*        int i = 100;
        do {
            System.out.print(a + " , и на шаге - " + i);
            i = i + 1;
            System.out.println();
        } while (i < b);*/
        do {
            System.out.println(a);
            b--;
        } while (b > 0);
    }

}
