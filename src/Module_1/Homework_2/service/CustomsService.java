package Module_1.Homework_2.service;

public class CustomsService {
    public static final int DUTY_RATE = 100;

    public static int calculateCustoms(int price, int weight) {

        return price / DUTY_RATE + weight * DUTY_RATE;
    }
}
