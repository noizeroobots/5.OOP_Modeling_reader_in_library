package ru.tinkoff.fintech.homework;

// written by Aleksey Dolgov
// written on 02.03.2021

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'f' if you want to choose and read a book: ");
        String starting = in.nextLine();

        if (starting.contains("f")) {
            Reader.book();
            Book book = Reader.choiceBook(Reader.book());
            String readBook = Reader.readBook(book);
            System.out.println("The book is: " + readBook);

            Integer rateBook = Reader.rateBook(book);
            System.out.println("The rate is: " + rateBook);

        } else
            System.out.println("Come back if you want to read something!");

    }
}
