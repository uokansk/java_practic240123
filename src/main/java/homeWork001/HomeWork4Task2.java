/*
 *  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 * */
package homeWork001;

import java.util.Collections;
import java.util.LinkedList;


public class HomeWork4Task2 {
    public static void main(String[] args) {
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");

        System.out.println("Список до: " + wordsList);

        for (int i = 0; i < wordsList.size() - 1; i++) {
            wordsList.add(i, wordsList.pollLast());
        }
        System.out.println("Список после: " + wordsList);
    }
}
