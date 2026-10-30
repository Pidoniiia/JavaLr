package org.example;

public class Main {
    public static void main(String[] args) {
        Installable[] softwareList = new Installable[5];

        softwareList[0] = new Game("Ведьмак, который заслужила т-396", "1.0", "RPG");
        softwareList[1] = new Game("Minecraft", "1.20", "Песочница");
        softwareList[2] = new Game("Counter-Strike 2", "1.0", "Шутер");
        softwareList[3] = new Editor("IntelliJ IDEA", "2023.2", ".java");
        softwareList[4] = new Editor("Photoshop", "v24", ".psd");

        for (int i = 0; i < softwareList.length; i++) {
            softwareList[i].install();
        }

        for (int i = 0; i < softwareList.length; i++) {
            if (softwareList[i] instanceof Updatable) {
                Updatable app = (Updatable) softwareList[i];

                System.out.println("Текущая версия ПО перед обновлением: " + app.getVersion());
                app.update();
            }
        }
    }
}
