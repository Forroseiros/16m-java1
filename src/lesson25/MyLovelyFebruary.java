package lesson25;

public class MyLovelyFebruary {
    public static void main(String[] args) {
        int a = 5;
        int[] arr = new int[10];
        // магия

        int[][] monthCalendar = new int[4][7];

        for (int outer = 0; outer < monthCalendar.length; outer++) {
            for (int inner = 0; inner < monthCalendar[outer].length; inner++) {
                monthCalendar[outer][inner] = outer * 7 + inner + 1;
                //порядковый номер строчки * количество дней недели +
                // порядковый номер столбика и наша любимая еденичка которая возникает в компьютерах
                System.out.print(monthCalendar[outer][inner]+ "  ");
            }
            System.out.println();
        }
        System.out.println("plz computer give me element 2,5 - " + monthCalendar[3][6]);
    }
}
