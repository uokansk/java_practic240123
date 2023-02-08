package homeWork001;
/*
* Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
*/

import java.util.LinkedList;
import java.util.Scanner;


public class HomeWork4Task1 {
    public static void main(String[] args) {
        enteringWords();

    }

    private static void enteringWords() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();

        while (true){
            System.out.print("Введите строку: ");
            String text = in.nextLine();
            if (text.equals("print")){
                System.out.println(wordsList);
                break;
            } else if (text.length() == 0) {
                System.out.println("Строка не должна быть пустой");
                continue;
            } else if (text.equals("revert")) {
                if (wordsList.size() <2){
                    System.out.println("Нет такого колличества элементов");
                    continue;
                }
                else {
                    wordsList.remove(1);
                    System.out.println("вот что осталось " + wordsList);
                }

            } else {
                wordsList.add(0, text);
            }
            System.out.println(wordsList);
        }
    }
}
