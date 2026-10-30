package org.example;

public class Main {
    public static void main(String[] args) {

        Sportsman[] teamList = new Sportsman[5];

        teamList[0] = new Forward("Алексей Миранчук", "Локомотив", 10, 10);
        teamList[1] = new Forward("Александр Кокорин", "Спартак", 9, 12);
        teamList[2] = new Defender("Игорь Дивеев", "ЦСКА", 4, 20);
        teamList[3] = new Defender("Георгий Джикия", "Динамо", 14, 25);
        teamList[4] = new Defender("Данил Круговой", "Зенит", 2, 18);


        for (int i = 0; i < teamList.length; i++) {
            teamList[i].displayInfo();

            System.out.println("Позиция игрока поле " + teamList[i].getPosition());
            System.out.println("Статистика игрока " + teamList[i].getStatistics());
        }
    }
}
