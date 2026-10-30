package org.example;

public class Game implements Installable, Updatable {
    private String name;
    private String version;
    private String genre;

    public Game(String name, String version, String genre) {
        this.name = name;
        this.version = version;
        this.genre = genre;
    }

    @Override
    public void install() {
        System.out.println("Игра " + name + genre + " успешно установлена на компьютер ");
    }

    @Override
    public void uninstall() {
        System.out.println("Игра " + name + " удалена ");
    }

    @Override
    public void update() {
        this.version = "2.0";
        System.out.println("Игра " + name + " обновлена до версии " + version);
    }

    @Override
    public String getVersion() {
        return this.version;
    }
}
