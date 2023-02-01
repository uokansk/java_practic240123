package homeWork001;

/*
 *Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 * */

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class HomeWork3Task2 {
    public static void main(String[] args) {
        minMaxMidlNumbers();

    }

    private static void minMaxMidlNumbers() {
        ArrayList<Integer> randNums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            randNums.add(random.nextInt(100));
        }
        System.out.println(randNums);
        IntSummaryStatistics stats = randNums.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("минимальное: " + stats.getMin()
                + ", максимальное: " + stats.getMax()
                + ", среднее арифметическое: " + stats.getAverage());

    }
}
