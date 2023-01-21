package com.me.kirilltrosnickii;

import java.util.Scanner;

public class HomeworkThree {
    public static int length;
    public static int width;
    public static int height;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть першу сторону");
        if (scan.hasNextInt()) {
            length = scan.nextInt();
        } else {
            System.out.println("Помилка,тільки цифри");
            scan.close();
        }

        System.out.println("Введіть другу сторону");
        if (scan.hasNextInt()) {
            width = scan.nextInt();
        } else {
            System.out.println("Помилка,тільки цифри");
            scan.close();
        }

        System.out.println("Введіть висоту");
        if (scan.hasNextInt()) {
            height = scan.nextInt();
        } else {
            System.out.println("Помилка,тільки цифри");
            scan.close();
        }


        System.out.println("Перша сторона: " + length);
        System.out.println("Друга сторона: " + width);
        System.out.println("Висота: " + height);


        int volume = length * width * height;
        int summ = length + width + height;
        System.out.println("Об'єм паралелепіпеда дорівнює " + volume);
        System.out.println("Сума заданих сторін паралелепіпеда дорівнює " + summ + " ,а його периметр дорівнює " + summ * 4);
    }

}