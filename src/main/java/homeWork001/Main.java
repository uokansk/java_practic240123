package homeWork001;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    private static void task3() {
        /*
        Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        */
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = iScanner.nextInt();
//        System.out.printf("Привет, %s!", year);
        iScanner.close();
        if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
            //  |(year % 400 == 0)
            System.out.println("Високосный");
        } else{
            System.out.println("Not Високосный");
        }
    }

        private static void task2 () {
        /*
        Задать одномерный массив и найти в нем минимальный и максимальный элементы
        */
            int[] nums = new int[25];  // создаем масив на 100 элементов
            Random random = new Random();

            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(100);  // заполнение от 0 до 99
            }
            System.out.println(Arrays.toString(nums));
            int max = nums[0];
            int min = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) max = nums[i];
                if (nums[i] < min) min = nums[i];
            }
            System.out.println("Наибольший элемент: " + max);
            System.out.println("Наименьший элемент: " + min);

        }

        private static void task1 () {
        /*Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        */
            int[] nums = new int[99];  // создаем масив на 10 элементов
            int temp;
            int right = nums.length - 1;
            Random random = new Random();

            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(4);  // заполнение от 0 до 3
            }
            System.out.println(Arrays.toString(nums));
            for (int i = 0; i < right; i++) {
                if (nums[i] == 3) {
                    if (nums[right] != 3) {
                        temp = nums[right];
                        nums[right] = nums[i];
                        nums[i] = temp;
                        --right;
                    } else if (nums[right] == 3) {
                        --right;
                        temp = nums[right];
                        nums[right] = nums[i];
                        nums[i] = temp;
                        --right;
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
