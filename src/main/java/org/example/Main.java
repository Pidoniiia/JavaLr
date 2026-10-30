package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        String filename = "plant_info.txt";
        String content = "Любимое растение 4 (четыре)\n" +
                "тип (четыре)\n" +
                "особенности (2^2)";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Абсолютный путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Можно читать: " + file.canRead());
            System.out.println("Можно писать: " + file.canWrite());
        }

        try (FileReader reader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            System.out.println("Содержимое файла:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task2() {
        String filename = "f_task2.txt";
        int[] numbers = {12, 5, 9, 14, 21, 8, 15, 30, 7, 44};

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int number : numbers) {
                writer.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Числа из файла:");
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                System.out.print(number + " ");
                if (number % 2 == 0 || number % 3 == 0) {
                    count++;
                }
            }
            System.out.println("\nКоличество чисел, кратных 2 или 3: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task3() {
        String fileF = "f_task3.txt";
        String fileG = "g_task3.txt";
        String fileH = "h_task3.txt";
        Random random = new Random();

        try (PrintWriter writerF = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < 20; i++) {
                writerF.println(random.nextInt(200) - 100);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader readerF = new BufferedReader(new FileReader(fileF));
             PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
             PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

            String line;
            while ((line = readerF.readLine()) != null) {
                int val = Integer.parseInt(line);
                if (val % 5 == 0 && val % 7 == 0) {
                    writerG.println(val);
                } else {
                    writerH.println(val);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task4() {
        String filename = "radiation_levels.txt";
        //double[] radiationData = {11.2, 15.4, 9.8, 22.1, 14.0, 18.3, 12.5, 16.7, 10.1, 13.9, 20.4, 17.2, 15.1, 8.9, 14.5};
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double [] radiationData = new double[a];
        for(int i = 0; i < radiationData.length;i++){
            radiationData[i] = in.nextDouble();
            if (radiationData[i] < 0 ) {
                System.out.println("Не могут быть отрицательные значения");
                radiationData[i] = in.nextDouble();
            }

        }
        in.close();

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (double value : radiationData) {
                writer.println(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        int totalElements = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line);
                totalElements++;
            }
            if (totalElements > 0) {
                System.out.println("Средний уровень радиации: " + (sum / totalElements));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task5() {
        String filename = "f_task5.txt";
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(150));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int val = Integer.parseInt(line);
                if (val > 75) {
                    count++;
                }
            }
            System.out.println("Количество чисел больших 75: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
