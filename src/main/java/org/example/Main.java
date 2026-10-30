package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Employee emp = new Employee("Человек Человеков", "Java", 5000);

        System.out.println("До повышения: " + emp);
        emp.raiseSalary(10.0);
        System.out.println("После повышения: " + emp);
        System.out.println(emp);

        Phone[] phones = {
                new Phone("Apple iPhone 15", 1000.0, 3349),
                new Phone("Samsung Galaxy S24", 900.0, 4000),
                new Phone("Xiaomi 14", 750.0, 4610),
                new Phone("Google Pixel 8", 700.0, 4575),
                new Phone("OnePlus 12", 800.0, 5400),
                new Phone("POCO X6", 350.0, 5100)
        };

        System.out.println("Список созданных телефонов ");
        for (Phone phone : phones) {
            System.out.println(phone);
        }

        System.out.println("Общая стоимость всех телефонов " + Phone.getTotalPrice());
        System.out.println("Средняя цена одного телефона " + Phone.getAveragePrice());

    }
}
