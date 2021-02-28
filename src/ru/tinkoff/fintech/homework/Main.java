package ru.tinkoff.fintech.homework;

// written by Aleksey Dolgov
// written on 25.02.2021

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'f' if you want to choose a random book: ");
        String action1 = in.nextLine();
        String f = "f";

        Book[] books = new Book[4];
        books[0] = new Book("Idiot", "Fedor Dostoevsky");
        books[1] = new Book("1984", "George Orwell", 1949);
        books[2] = new Book("Romeo and Juliet", "William Shakespeare", 1595, 318);
        books[3] = new Book("Master and Margarita", "Michail Bulgakov", 1920, 328, 1);

        Reader result = new Reader();
        result.choiceBook(books);
    }
}
