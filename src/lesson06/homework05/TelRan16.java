package lesson06.homework05;

public class TelRan16 {
    public static void main(String[] args) {
        String student1 = "Саша";
        String student2 = "Даша";
        String dasha = "Паша";
        System.out.println(introMessage(student1));
        System.out.println(introMessage(student2));
        System.out.println(introMessage(dasha));
        System.out.println(introMessage("Сергей"));
    }

    public static String introMessage(String student){
        String message = "Вы зачислены на базовый курс программирования";
        return "Добрый день " + student + "\n" + message;
    }

}
