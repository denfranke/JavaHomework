package Other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> employees = new ArrayList<>();

        employees.add(new HashMap<>() {{
            put("Имя", "Кирилл");
            put("Возраст", "26");
            put("Должность", "Middle java dev");
            put("Зарплата", "150000 руб");
        }});
        employees.add(new HashMap<>() {{
            put("Имя", "Виталий");
            put("Возраст", "28");
            put("Должность", "Senior java automation QA");
            put("Зарплата", "2000$");
        }});
        employees.add(new HashMap<>() {{
            put("Имя", "Александр");
            put("Возраст", "31");
            put("Должность", "junior functional tester");
            put("Зарплата", "50000 руб");
        }});
        employees.add(new HashMap<>() {{
            put("Имя", "Дементтий");
            put("Возраст", "35");
            put("Должность", "dev-ops");
            put("Зарплата", "1500$");
        }});

        System.out.println("Сотрудники младше 30:");
        for (Map<String, String> i : employees)
            if (Integer.parseInt(i.get("Возраст")) < 30)
                System.out.println(i.get("Имя"));

        System.out.println("\n\nСотрудники, получающие зарплату в рублях:");
        for (Map<String, String> i : employees)
            if (i.get("Зарплата").endsWith("руб"))
                System.out.println(i.get("Имя"));

        double sum = 0;
        for (Map<String, String> i : employees)
            sum += Integer.parseInt(i.get("Возраст"));
        System.out.println("\n\nСредний возраст всех сотрудников: " + sum / employees.size());
    }
}
