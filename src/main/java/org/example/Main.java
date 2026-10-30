package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Dish> dishMap = new HashMap<>();

        dishMap.put("Глубокая суповая", new Plate("Глубокая суповая", "01", 0.5, 24.0));
        dishMap.put("Десертная тарелочка", new Plate("Десертная тарелочка", "02", 0.2, 18.0));
        dishMap.put("Подставная большая", new Plate("Подставная большая", "03", 0.0, 30.0));

        dishMap.put("Кофейная чашка", new Cup("Кофейная чашка", "011", 0.1, true));
        dishMap.put("Пиала чайная", new Cup("Пиала восточная", "012", 0.2, false));
        dishMap.put("Большая кружка", new Cup("Большая кружка", "013", 0.4, true));

        dishMap.put("Малый салатник", new Bowl("Малый салатник", "014", 0.6, 8.5));
        dishMap.put("Общая супница", new Bowl("Общая супница", "015", 2.5, 15.0));

        for (Map.Entry<String, Dish> entry : dishMap.entrySet()) {
            System.out.println("Ключ и значение " + entry.getKey() + " " + entry.getValue());
        }

        List<Coach> coaches = new ArrayList<>();
        coaches.add(new Coach("016", "Алексей", "Футбол", 1, Arrays.asList(4, 5, 5, 4)));
        coaches.add(new Coach("017", "Владимир", "Плавание", 2, Arrays.asList(2, 3, 2, 2)));
        coaches.add(new Coach("018", "Дмитрий", "Хоккей", 3, Arrays.asList(5, 5, 4, 5)));
        coaches.add(new Coach("019", "Борис", "Бокс", 1, Arrays.asList(3, 4, 3, 4)));
        coaches.add(new Coach("020", "Анна", "Гимнастика", 2, Arrays.asList(4, 5, 4, 5)));
        coaches.add(new Coach("021", "Алексей", "Теннис", 2, Arrays.asList(5, 5, 5, 5)));

        for (int i = 0; i < coaches.size(); i++) {
            System.out.println(coaches.get(i));
        }

        Iterator<Coach> iterator = coaches.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAverageRating() < 3.0) {
                iterator.remove();
            }
        }

        for (int i = 0; i < coaches.size(); i++) {
            Coach c = coaches.get(i);
            if (c.getAverageRating() >= 4.0)
            {
                c.setLevel(c.getLevel() + 1);
            }
            else if (c.getLevel() >= 5) {
                c.setLevel(5);
            }
        }
        printCoaches(coaches, 3);
        Collections.sort(coaches);

        for (int i = 0; i < coaches.size(); i++) {
            Coach c = coaches.get(i);
            System.out.println("айди " + c.getId() + " уровень " + c.getLevel() + " имя " + c.getName() + " средний рейтинг " + String.format("%.2f", c.getAverageRating()));
        }
    }

    public static void printCoaches(List<Coach> coaches, int level) {
        boolean found = false;
        for (int i = 0; i < coaches.size(); i++) {
            if (coaches.get(i).getLevel() == level) {
                System.out.println(coaches.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Тренеров с уровнем " + level + " не нашли");
        }
    }
}
