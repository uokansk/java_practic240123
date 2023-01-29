/*
Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
* */

package homeWork001;

import java.util.Scanner;

public class HomeWork2Task1 {
    public static void main(String[] args) {
        palindrome();
    }

    private static void palindrome() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = iScanner.nextLine();
        iScanner.close();
        boolean flag = false;
        for (int i = 0; i < s.length() / 2; i++) {
            flag = s.charAt(i) == s.charAt(s.length() - 1 - i);
        }
        System.out.println(flag);
    }
}
