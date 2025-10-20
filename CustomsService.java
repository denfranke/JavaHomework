package ru.netology.service;

public class CustomsService {
    public static final int DUTY_RATE = 100;

    public static int calculateCustoms(int price, int height) {

        return price / DUTY_RATE + height * DUTY_RATE;
    }
}
