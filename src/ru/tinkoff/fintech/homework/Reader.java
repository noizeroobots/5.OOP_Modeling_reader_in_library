package ru.tinkoff.fintech.homework;

import java.util.Random;

public class Reader extends Main{
    public static String[] choiceBook(String[] list) {
        Random random = new Random();
        int index = random.nextInt(list.length);
        String name = list[index];
        System.out.println("topol " + name);
        return list;
    }
}
