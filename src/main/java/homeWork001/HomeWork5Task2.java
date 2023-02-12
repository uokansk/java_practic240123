package homeWork001;


import java.util.LinkedHashMap;

/*
 * Пусть дан список сотрудников:Иван Иванов
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 * */
public class HomeWork5Task2 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> clerk = new LinkedHashMap<>();
        clerk.put("Иванов", "Мария");
        clerk.put("Петрова", "Светлана");
        clerk.put("Белова", "Кристина");
        clerk.put("Мусина", "Анна");
        clerk.put("Крутова", "Анна");
        clerk.put("Юрин", "Иван");
        clerk.put("Лыков", "Петр");
        clerk.put("Чернов", "Павел");
        clerk.put("Чернышов", "Петр");
        clerk.put("Федорова", "Иван");
        clerk.put("Светлова", "Марина");
        clerk.put("Савина", "Мария");
        clerk.put("Рыкова", "Мария");
        clerk.put("Лугова", "Марина");
        clerk.put("Владимирова", "Анна");
        clerk.put("Мечников", "Иван");
        clerk.put("Петин", "Петр");
        clerk.put("Ежов", "Иван");
        System.out.println(clerk);
        System.out.println(clerk.values());
        System.out.println(clerk.keySet());
        LinkedHashMap<String, Integer> newClerk = new LinkedHashMap<>();
        for (String key : clerk.keySet()) {
            int count = 0;
            for (String key2 : clerk.keySet()) {
                if (clerk.get(key).equals(clerk.get(key2))) {
                    count++;
                    if (count != 1) {
                        newClerk.put(clerk.get(key), count);
                    }
                }
            }
        }
        System.out.println(newClerk);
    }
}

