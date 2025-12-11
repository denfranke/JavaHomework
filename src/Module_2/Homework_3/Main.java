package Module_2.Homework_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("До свидания!");
                    return;
                case 1:
                    System.out.print("\nВведите название задачи: ");
                    String task = scanner.nextLine();

                    if (task.isEmpty()) {
                        System.out.println("Название задачи не может быть пустым.");
                        return;
                    }

                    if (todoList.contains(task)) {
                        System.out.println("Такое дело уже существует!");
                    } else {
                        todoList.add(task);
                        System.out.println("Добавлено!");
                    }

                    break;
                case 2:
                    showTasks(todoList);
                    break;
                case 3:
                    if (todoList.isEmpty()) {
                        System.out.println("Список дел пуст.");
                        return;
                    }

                    showTasks(todoList);
                    System.out.print("\nВведите номер для удаления: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Некорректный ввод.");
                        scanner.next();
                        return;
                    }

                    int index = scanner.nextInt();
                    scanner.nextLine();

                    if (index < 1 || index > todoList.size()) {
                        System.out.println("Нет дела с таким номером.");
                    } else {
                        todoList.remove(index - 1);
                        System.out.println("Удалено!");
                    }
                    break;
                case 4:
                    if (todoList.isEmpty()) {
                        System.out.println("Список дел пуст.");
                        return;
                    }

                    System.out.print("\nВведите задачу для удаления: ");

                    if (todoList.remove(scanner.nextLine())) {
                        System.out.println("Удалено!");
                    } else {
                        System.out.println("Дело с таким названием не найдено.");
                    }
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }

            showTasks(todoList);
        }
    }

    private static void showTasks(List<String> todoList) {
        if (todoList.isEmpty()) {
            System.out.println("Ваш список дел пуст.");
            return;
        }

        System.out.println("\nВаш список дел:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }
}