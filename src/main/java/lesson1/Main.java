package lesson1;  // название пространства
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        ex1();
        ex2();
    }

    private static void ex1() {
         Scanner iScanner = new Scanner(System.in);
         System.out.printf("Введите имя: ");
         String name = iScanner.nextLine();
         System.out.printf("Привет, %s!", name);
         iScanner.close();
    }

    private static void ex2() {
        int[] binaryArray = new int[1000];  // создаем масив на 1000 элементов
        int count = 0;
        int maxLength = 0;
        Random random = new Random();

        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2);  // заполнение от 0 до 1

        }
        System.out.println(Arrays.toString(binaryArray));

        for (int num : binaryArray) {
            if (num ==1){
                count++;
            } else {
                /*if (count > maxLength){
                    maxLength = count;
                    count = 0;
                }*/
                // (условие тернарный оператор) ? true : false
//                maxLength = (count > maxLength) ? count : maxLength;

                maxLength = Math.max(count, maxLength);
                count = 0;

            }
        }

        System.out.println("max Length: " + Math.max(count, maxLength));



    }
}
