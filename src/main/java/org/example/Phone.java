package org.example;

public class Phone {
    private String brand;
    private double price;
    private int battery;

    private static int totalPhones = 0;
    private static double totalPrice = 0.0;


    public void printPhones(){
        System.out.println(this.brand + this.price + this.battery + totalPhones + totalPrice);
    }

    public static void printStPhones(Phone phoneObj){
        System.out.println(totalPhones + totalPrice + phoneObj.brand + phoneObj.price + phoneObj.battery);
    }


    public Phone(String brand, double price, int battery) {
        this.brand = brand;
        this.price = price;
        this.battery = battery;

        totalPhones++;
        totalPrice += price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getBattery() {
        return battery;
    }

    public static int getTotalPhones() {
        return totalPhones;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static double getAveragePrice() {
        if (totalPhones == 0) {
            return 0.0;
        }
        return totalPrice / totalPhones;
    }

    @Override
    public String toString() {
        return brand + " Цена " + price + " Батарея " + battery;
    }
}
