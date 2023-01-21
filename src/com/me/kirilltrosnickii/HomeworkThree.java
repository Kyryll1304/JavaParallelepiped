package com.me.kirilltrosnickii;

import java.util.Scanner;

public class HomeworkThree {
    public static int number;
    public static int numberOne;
    public static int numberTwo;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть першу сторону");
        Scanner scanOne = new Scanner(System.in);
        System.out.println("Введіть другу сторону");
        Scanner scanTwo = new Scanner(System.in);
        System.out.println("Введіть третю сторону");

        String line = scan.nextLine();
        System.out.println("Перша сторона: " + line);
        String lineOne = scanOne.nextLine();
        System.out.println("Друга сторона: " + lineOne);
        String lineTwo = scanTwo.nextLine();
        System.out.println("Третя сторона: " + lineTwo);

        try {
            number = Integer.parseInt(line);
            numberOne = Integer.parseInt(lineOne);
            numberTwo = Integer.parseInt(lineTwo);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        int volume = number * numberOne * numberTwo;
        int length = number + numberOne + numberTwo;
        System.out.println("Об'єм паралелепіпеда дорівнює " + volume);
        System.out.println("Сума заданих сторін паралелепіпеда дорівнює " + length + " ,а його периметр дорівнює " + length * 4);
    }

}