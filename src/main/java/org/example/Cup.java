package org.example;

public class Cup extends Dishware {
    private boolean handle;

    public Cup(String name, double volume, String color, boolean handle) {
        super(name, volume, color);
        this.handle = handle;
    }

    public boolean isHandle() {
        return handle;
    }

    public void setHandle(boolean handle) {
        this.handle = handle;
    }

    @Override
    public void use() {
        System.out.println("Для напитков");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Наличие ручки " + (handle ? "Да" : "Нет"));
    }

    public void fill() {
        System.out.println("Чашка " + getName() + " наполнена");
    }
}
