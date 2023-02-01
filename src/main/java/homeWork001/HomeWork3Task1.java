package homeWork001;
/*
Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
* */

import java.util.ArrayList;
import java.util.Random;

public class HomeWork3Task1 {
    public static void main(String[] args) {
        randomNumbersArray();
    }

    private static void randomNumbersArray() {
        ArrayList<Integer> randNums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            randNums.add(random.nextInt(100));
        }
        System.out.println(randNums);
        randNums.removeIf(x -> (x % 2 == 0));
        System.out.println(randNums);
    }
}
