package lesson22;

import lesson20.Main;

public class GenerateArray {
    public static void main(String[] args) {
        int[] array = generateIntArray();
Main.printArrayForEach(array);
    }

    public static int[] generateIntArray() {
        int randomLength = randomGenerate(25);
        System.out.println(randomLength);
        int [] output = new int [randomLength];
        Main.printArrayForEach(output);
        for (int i = 0; i < output.length ; i++) {
           output[i]=(int) (Math.random() * 25);
        }
        return output;
    }

    public static int randomGenerate(int size) {
        int myValue = (int)(Math.random() *size);
        if (myValue<5){
            myValue=4;
        }
        return myValue;
    }
}
