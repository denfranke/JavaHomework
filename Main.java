package Homework_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0, year, days;
        while (true) {
            System.out.println("Введите год:");
            year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            days = scanner.nextInt();

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                if (days != 366)
                    System.out.println("Неправильно! В этом году 366 дней!\n" +
                            "Набрано очков: " + k);
                else
                    k++;
            else if (days != 365) {
                System.out.println("Неправильно! В этом году 365 дней!\n" +
                        "Набрано очков: " + k);
                break;
            } else
                k++;
        }
    }
}
