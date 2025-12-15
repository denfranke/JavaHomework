package Module_2.Homework_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Russia", "Moscow");
        Address address2 = new Address("Russia", "Omsk");
        Address address3 = new Address("Russia", "Saransk");
        Address address4 = new Address("Russia", "Kazan");
        Address address5 = new Address("France", "Paris");

        MyMap<Address, Integer> costPerAddress = new MyMap<>();
        costPerAddress.put(address1, 100);
        costPerAddress.put(address2, 200);
        costPerAddress.put(address3, 300);
        costPerAddress.put(address4, 200);
        costPerAddress.put(address5, 100);

        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;
        List<String> uniqueCountries = new ArrayList<>();

        while (true) {
            System.out.println("\nЗаполнение нового заказа.");
            System.out.println("Введите страну: ");
            String country = scanner.nextLine();

            if (country.equals("end")) {
                break;
            }

            System.out.println("Введите город: ");
            String city = scanner.nextLine();

            System.out.println("Введите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());

            Address address = new Address(country, city);

            //System.out.println(address4.getCity().equals(address.getCity()));
            //System.out.println(address4.getCountry().equals(address.getCountry()));

            if (costPerAddress.get(address) != null) {
                int deliveryCost = costPerAddress.get(address) * weight;
                totalCost += deliveryCost;

                boolean flag = false;
                for (String c : uniqueCountries) {
                    if (c.equals(country)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    uniqueCountries.add(country);
                }

                System.out.println("Стоимость доставки составит: " + deliveryCost + " руб.");
                System.out.println("Общая стоимость всех доставок: " + totalCost + " руб.");
                System.out.println("Количество уникальных стран: " + uniqueCountries.size());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }

        }
    }
}
