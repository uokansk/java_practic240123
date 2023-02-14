package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
//import java.util

public class Les3Task1 {
    public static void main(String[] args) {
//        numberGenSort();
        sortWithCol();
    }

    private static void sortWithCol() {
        ArrayList<Integer> randNums = new ArrayList<>();
        Random random = new Random();
        for (int i =0; i < 25; i++) {
            randNums.add(random.nextInt(3, 11));
        }
        System.out.println(randNums);
        randNums.sort(Comparator.naturalOrder());
        Collections.sort(randNums);
        System.out.println(randNums);
        Collections.sort(randNums, Comparator.reverseOrder());
        System.out.println(randNums);


//    private static void numberGenSort() {
//        int[] nums = new int[10];  // создаем масив на 10 элементов
//        Random random = new Random();
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = random.nextInt(3, 11);  // заполнение от 3 до 10
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(Arrays.stream(nums).sorted().toArray()));
//    }

    }
}
