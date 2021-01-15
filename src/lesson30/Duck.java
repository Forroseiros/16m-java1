package lesson30;

public class Duck {
    String breed; // порода утки
    int age;  // возраст
    String color; // цвет
    String name;
    int rangeAge;

    void quacks() {
        System.out.println("Duck quacks // Уточка крякает");
    }

    void eats() {
        System.out.println("Duck eats // Уточка кушает");
    }

    void swims(int meter) {
        System.out.println(name + " swims");
        rangeAge = rangeAge + meter;
    }

    void flies() {
        System.out.println("I BELIEVE!!!");
        System.out.println("I CAN FLY!!!");
        System.out.println("I FLY!!!");
    }
}

class DuckTest {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.name = "Дональд";
        Duck daisy = new Duck();
        Duck goofy = new Duck();
        Duck daffy = new Duck();
        daffy.name = "Даффи";
        Duck[] newDuckArray = new Duck[]{donald, daisy, goofy};
        System.out.println(newDuckArray[0].name);
        newDuckArray[0] = daffy;
        System.out.println(newDuckArray[0].name);

        // проверка километража
        goofy.name = "Гуффи";
        goofy.swims(100);
        System.out.println("Состояние спидометра уточки " + goofy.rangeAge);
        goofy.swims(300);
        System.out.println(goofy.rangeAge);
    }
}