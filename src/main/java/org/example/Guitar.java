package org.example;

public class Guitar extends Instrument {
    private int stringsCount;

    public Guitar(String name, String type, String sound, int stringsCount) {
        super(name, type, sound);
        this.stringsCount = stringsCount;
    }

    public int getStringsCount() {
        return stringsCount;
    }

    public void setStringsCount(int stringsCount) {
        this.stringsCount = stringsCount;
    }

    @Override
    public String getSoundType() {
        return "Лязг струн";
    }
}
