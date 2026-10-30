package org.example;

public class Main {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar("Fender ", "Электрогитара", "Бренчание", 6);
        Piano myPiano = new Piano("Yamaha ", "Пианино", "Аккорды", 88);

        System.out.println("Какой звук " + myGuitar.getSoundType());

        myGuitar.play();
        myGuitar.play(8);
        myGuitar.play("When u sleep");

        System.out.println("Какой звук " + myPiano.getSoundType());

        myPiano.play();
        myPiano.play(5);
        myPiano.play("Что то пианнинное");
    }
}
