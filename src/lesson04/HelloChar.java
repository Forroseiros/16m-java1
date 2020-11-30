package lesson04;

public class HelloChar {
    // символы
    public static void main(String[] args) {
        char zahl = 100;
        System.out.println(zahl);
        char octal = '\u00A9';
        char test = '\u217B';
        System.out.println(test);
        System.out.println(octal);
        char euroSymbol = '€';
        System.out.println(euroSymbol);
        char tabulator = '\t';
        System.out.print(tabulator);
        System.out.print("хфгдх");
        System.out.println("ожидаем 4 пробела");
        System.out.println('a' + 'b' + 'c');
        System.out.println("" + 'a' + 'b' + 'c');
    }
}
