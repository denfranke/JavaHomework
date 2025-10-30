package Homework_2;

import java.util.Scanner;

import Homework_2.service.CustomsService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        System.out.println("Размер пошлины (в руб.) составит: " + CustomsService.calculateCustoms(price, weight));
    }
}
