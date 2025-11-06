package Homework_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nСписок товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        int sumProducts = 0, j = 0;
        int[] prdctNum = new int[products.length];
        int[] cnt = new int[products.length];

        while (true) {
            System.out.println("Выберите товар и количество или введите end: ");

            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }
            int productNumber = Integer.parseInt(input);
            prdctNum[j] = productNumber - 1;
            int productCount = Integer.parseInt(scanner.next());
            cnt[j] = productCount;
            j++;

            sumProducts += prices[productNumber - 1] * productCount;
        }
        System.out.println("Ваша корзина:");
        for (int i = 0; i < j; i++) {
            System.out.println(products[prdctNum[i]] + " " + cnt[i] + " шт " + prices[prdctNum[i]] + " руб/шт " + (prices[prdctNum[i]] * cnt[i]) + "руб в сумме");
        }
        System.out.println("Итого " + sumProducts);
        scanner.close();
    }
}
