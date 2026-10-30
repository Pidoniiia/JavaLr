package org.example;

public class Instrument {
    private String name;
    private String type;
    private String sound;

    public Instrument(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public void play() {
        System.out.println("Инструмент " + name + " Играю");
    }

    public void play(int volume) {
        System.out.println("Инструмент " + name + " Играю громкостью " + volume);
    }

    public void play(String melody) {
        System.out.println("Инструмент " + name + " Играю мелодию " + melody);
    }

    public String getSoundType() {
        return "Стандартный звук";
    }
}
