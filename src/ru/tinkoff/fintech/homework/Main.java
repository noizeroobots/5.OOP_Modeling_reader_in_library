package ru.tinkoff.fintech.homework;

// written by Aleksey Dolgov
// written on 25.02.2021

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'f' if you want to choose a random book: ");
        String action1 = in.nextLine();

        Reader.book();
        Book book = Reader.choiceBook(Reader.book());
        Reader.readBook(book);

        System.out.println("The book is: " + book);
        Reader.rateBook(book);

    }
}
