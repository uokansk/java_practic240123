package lesson2;

import java.util.Scanner;

/*
 * дано четное число N (>0) и символы c1, c2. Написать метод, который вернет длину строки, которая состоит из чередующихся символов c1 и c2.
 * */
public class Main {
    public static void main(String[] args) {
//        taskString();
        variantTwo();

    }

    private static void variantTwo() {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите четное число: ");
        int numberN = read.nextInt();

        read = new Scanner(System.in);
        System.out.print("Введите первый символ: ");
        char firstChar = read.next().charAt(0);

        read = new Scanner(System.in);
        System.out.print("Введите второй символ: ");
        char secondChar = read.next().charAt(0);

        read.close();

        String str =
                String.valueOf(firstChar)
                .concat(String.valueOf(secondChar))
                .repeat(numberN / 2);
//        StringBuilder sb = new StringBuilder();

        if (numberN % 2 == 1) {
//            sb.append(firstChar);
            str += String.valueOf(firstChar);
        }
        System.out.println(str);
    }

    private static void taskString() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите четное число: ");
        int numberN = 2;
        try {
            numberN = iScanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка");
//            e.printStackTrace();
            //log.error("Ошибка")
        }

        System.out.print("Введите первый символ: ");
        String firstChar = " ";
        try {
            firstChar = iScanner.next();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        System.out.print("Введите второй символ: ");
        String secondChar = " ";
        try {
            secondChar = iScanner.next();
        } catch (Exception e) {
            System.out.println("Ошибка");
        }

        iScanner.close();
        System.out.println("Вы ввели - " + numberN);
        StringBuilder cord = new StringBuilder();
        for (int i = 0; i < numberN; i++) {
            if (i % 2 == 0) {
                cord.append(firstChar);
            } else {
                cord.append(secondChar);
            }
        }
        System.out.println("Ну как-то так - " + cord);
//        System.out.println("Ну как-то так - " + cord.length());
    }
}
