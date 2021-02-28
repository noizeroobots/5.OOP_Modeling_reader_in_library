package ru.tinkoff.fintech.homework;

import java.util.Random;

public class Reader extends Main{
    public static Book[] choiceBook(Book[] books) {
        Random random = new Random();
        int index = random.nextInt(books.length);
        Book name = books[index];
        System.out.println("topol " + name);
        return books;
    }
}
