package org.example;

public class Piano extends Instrument {
    private int keysCount;

    public Piano(String name, String type, String sound, int keysCount) {
        super(name, type, sound);
        this.keysCount = keysCount;
    }

    public int getKeysCount() {
        return keysCount;
    }

    public void setKeysCount(int keysCount) {
        this.keysCount = keysCount;
    }

    @Override
    public String getSoundType() {
        return "Стук клавиш";
    }
}
