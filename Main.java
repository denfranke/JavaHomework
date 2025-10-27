package Homework_3;

import java.util.Scanner;

public class Main {

    public static int taxEarnings(int earnings) {
        return Math.max((earnings) * 6 / 100, 0);
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        return Math.max((earnings - spendings) * 15 / 100, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0, spendings = 0;
        String input;

        while (true) {
            System.out.println("\nВыберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");

            input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);
            int money = 0;
            String moneyStr;

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расходов:");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    spendings += money;
                    break;
                case 3:
                    int tax1 = taxEarnings(earnings);
                    int tax2 = taxEarningsMinusSpendings(earnings, spendings);

                    if (tax1 < tax2) {
                        System.out.println("\nМы советуем вам УСН доходы\n" +
                                "Ваш налог составит: " + tax1 +
                                "\nНалог на другой системе: " + tax2 +
                                "\nЭкономия: " + (tax2 - tax1));
                    } else {
                        System.out.println("\nМы советуем вам УСН доходы минус расходы\n" +
                                "Ваш налог составит: " + tax2 +
                                "\nНалог на другой системе: " + tax1 +
                                "\nЭкономия: " + (tax1 - tax2));
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}
