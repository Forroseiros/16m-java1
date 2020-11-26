package lesson03;

/**
 * Java-m1-16m
 * 25 12 : 36
 */
public class HomeWork03 {
    public static void main(String[] args) {
        double myRelation = exercise04();
        System.out.println(myRelation);
        System.out.println(exercise4AnotherTime(234324, 3245));
        System.out.println(exercise4AnotherTime(3423, 234234));
    }

    public static double exercise4AnotherTime
            (double firstArea, double secondArea) {

        double areaRelation = firstArea / secondArea;
        return areaRelation;
    }

    public static double exercise04() {
        // 4. Найти соотношение площади Беларуси к площади Украины.
        // 	B - 207,595 km2
        // U - 603,628 km2
        double belarusArea = 207.595;
        double ukraineArea = 603.628;
        double relation = belarusArea / ukraineArea;
        //System.out.println("соотношение площадей двух стран" + relation);
        return relation;
    }
}
