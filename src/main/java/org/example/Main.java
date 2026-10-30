package org.example;

public class Main {
    public static void main(String[] args) {
        Dishware[] inventory = new Dishware[5];

        inventory[0] = new Plate("Суповая", 0.5, "Белый", 24.0);
        inventory[1] = new Plate("Маленькая", 0.2, "Розовый", 18.0);
        inventory[2] = new Plate("Обычная тарелка", 0.4, "Синий", 26.5);
        inventory[3] = new Cup("Кружка", 0.35, "Черный", true);
        inventory[4] = new Cup("Маленькая чашка", 0.25, "Зеленый", false);

        for (int i = 0; i < inventory.length; i++) {
            inventory[i].displayInfo();
            System.out.print("Назначение ");
            inventory[i].use();
        }


        for (int i = 0; i < inventory.length; i++) {

            if (inventory[i] instanceof Plate) {
                Plate p = (Plate) inventory[i];
                p.stack();
            } else if (inventory[i] instanceof Cup) {
                Cup c = (Cup) inventory[i];
                c.fill();
            }
        }

    }
}
