package homeWork001;

/*
* Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.LinkedHashSet;

public class HomeWork3Task3 {
    public static void main(String[] args) {
        listPlanet();
    }

    private static void listPlanet() {
        List<String> planets = new ArrayList<>();
        Random rand = new Random();

        String[] listPlanets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        for (int i = 0; i < listPlanets.length; i++) {
            System.out.println(listPlanets[i]);

        }
        for (int i = 0; i < 20; i++) {
            int randIndex = rand.nextInt(listPlanets.length);
            planets.add(listPlanets[randIndex]);
        }
        System.out.println(planets);

        Set<String> set = new LinkedHashSet<>(planets);
        List<String> planetsWithoutDuplicates = new ArrayList<>(set);
        System.out.println(planetsWithoutDuplicates);
    }
}
