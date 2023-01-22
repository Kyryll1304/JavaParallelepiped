package anotherVar;

import java.util.Scanner;

public class OtherWay {

    private static int readInt(Scanner scanner) {
        int dot= -1;
        do {
            if (scanner.hasNextInt()) {
                dot = scanner.nextInt();
            } else {
                System.out.println("Число,будь ласка");
                scanner.nextLine();
            }
        } while (dot <= 0);
        return dot;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть першу сторону.Тільки позитивні значення.");
        int length = OtherWay.readInt(scan);

        System.out.println("Введіть другу сторону.Тільки позитивні значення.");
        int width = OtherWay.readInt(scan);

        System.out.println("Введіть висоту сторону.Тільки позитивні значення.");
        int height = OtherWay.readInt(scan);


        System.out.println("Перша сторона: " + length);
        System.out.println("Друга сторона: " + width);
        System.out.println("Висота: " + height);

        int volume = length * width * height;
        int summ = length + width + height;
        int perimetr = 4 * (length + width + height);
        System.out.println("Об'єм паралелепіпеда дорівнює " + volume);
        System.out.println("Сума заданих сторін паралелепіпеда дорівнює " + summ + " ,а його периметр дорівнює " + perimetr);
    }
}
