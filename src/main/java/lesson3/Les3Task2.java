package lesson3;

import java.util.ArrayList;
import java.util.Random;

public class Les3Task2 {
    public static void main(String[] args) {
//        listPlanets();
//        countPlanets();
    }

//    private static void countPlanets() {
//        String[] pl = listPlanets().toArray(new String[20]);
//        int count = 1;
//        int i;
//        String word = "";
//        for (i = 1; i < pl.length; i++) {
//            if (pl[i-1].equals(pl[i])) {
//                count++;
//            }
//            else {
//                rez.append(sb.charAt(i - 1));
//                rez.append(count);
//                count = 1;
//            }
//        }
//        rez.append(sb.charAt(i-1));
//        rez.append(count);
//        System.out.println(pl);
//
//    }

    private static ArrayList<String> listPlanets() {
        String[] listPlanets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        ArrayList<String> planets = new ArrayList<>();
        Random random = new Random();
        for (int i =0; i < 20; i++) {
            planets.add(listPlanets[random.nextInt(8)]);
        }
        System.out.println(planets);
        return planets;
//        System.out.println(planets);
    }
}
