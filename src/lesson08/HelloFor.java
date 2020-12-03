package lesson08;

public class HelloFor {
    public static void main(String[] args) {
        myWeek();
    }

    public static void myWeek() {
        int weekDays = 7;
        int x = 1;
        // начало
        // условие
        // шаг
        for (int i = 1; i <= weekDays; i++) {
            System.out.print(i + ", ");
            System.out.println("--------");
            System.out.println("Я встаю в пять утра");
            System.out.println("Завтракаю");
            System.out.println("Иду на работу");
            System.out.println("Прихожу с работы");
            System.out.println("Курю с соседом");
            System.out.println("Ужинаю");
            System.out.println("Смотрю Нетфликс");
            System.out.println("Иду спать");
            System.out.println(i);
        }
    }

}
