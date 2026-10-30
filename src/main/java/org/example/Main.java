package org.example;

public class Main {
    public static void main(String[] args) {
        Delivery[] deliveryList = new Delivery[3];

        try {
            Delivery badData = new Delivery("99", "ул. Ленина 5", -10.5, 15.0);
        } catch (InvalidDeliveryDataException e) {
            System.out.println("исключение" + e.getMessage());
        }

        try {
            deliveryList[0] = new Delivery("1", "ул. Сурганова 12", 2.5, 5.4);
            deliveryList[1] = new Delivery("2", "пр. Победителей 45", 15.0, 22.1);
            deliveryList[2] = new Delivery("3", "ул. Немига 3", -0.8, 1.2);
        } catch (InvalidDeliveryDataException e) {
            System.err.println("ошибка" + e.getMessage());
        }

        try {
            deliveryList[0].startDelivery();
            deliveryList[0].completeDelivery();
        } catch (DeliveryException e) {
            System.out.println("все гуд");
        }

        try {
            deliveryList[1].completeDelivery();
        } catch (DeliveryException e) {
            System.out.println("ошибка " + e.getMessage());
        }


        String searchId = "27";
        try {
            Delivery foundDelivery = findDeliveryById(deliveryList, searchId);
        } catch (DeliveryNotFoundException e) {
            System.out.println("ошибка поиска " + e.getMessage());
        }
    }

    public static Delivery findDeliveryById(Delivery[] list, String id) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getOrderId().equals(id)) {
                return list[i];
            }
        }
        throw new DeliveryNotFoundException(id + " не найдена");
    }
}
