package org.example;

public class Delivery {
    private String orderId;
    private String address;
    private double weight;
    private double distance;
    private String status;

    public Delivery(String orderId, String address, double weight, double distance) throws InvalidDeliveryDataException {
        this.orderId = orderId;
        this.address = address;
        setWeight(weight);
        setDistance(distance);
        this.status = "Создан";
    }

    public String getOrderId()
    {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setWeight(double weight) throws InvalidDeliveryDataException {
        if (weight <= 0) {
            throw new InvalidDeliveryDataException(" вес должен быть больше 0 " + weight);
        }
        this.weight = weight;
    }

    public void setDistance(double distance) throws InvalidDeliveryDataException {
        if (distance <= 0) {
            throw new InvalidDeliveryDataException(" расстояние должно быть больше 0 " + distance);
        }
        this.distance = distance;
    }

    public void startDelivery() {
        if (!this.status.equalsIgnoreCase("Создан")) {
            throw new DeliveryException("нельзя начать доставку заказа " + orderId);
        }
        this.status = "в пути";
        System.out.println("заказ " + orderId + " успешно отправлен в путь по адресу " + address);
    }

    public void completeDelivery() {
        if (!this.status.equalsIgnoreCase("в пути")) {
            throw new DeliveryException("Нельзя завершить доставку заказа " + orderId);
        }
        this.status = "доставлен";
        System.out.println("Заказ " + orderId + " успешно доставлен");
    }

    @Override
    public String toString() {
        return "айди " + orderId + " адрес " + address + " статус " + status;
    }
}
