package ru.tinkoff.fintech.homework;

import java.util.Random;

public class Reader {

    public static Book[] book() { // Массив Book с разной заполненностью
        Book[] books = new Book[4];
        books[0] = new Book("Idiot", "Fedor Dostoevsky");
        books[1] = new Book("1984", "George Orwell", 320);
        books[2] = new Book("Romeo and Juliet", "William Shakespeare", 318, 1);
        books[3] = new Book("Master and Margarita", "Michail Bulgakov", 328, 2);
        return books;
    }

    public static Book choiceBook(Book[] books) { // Здесь выбираем книгу с помощью choiceBook
        Random random = new Random();
        int index = random.nextInt(books.length);
        return books[index];
    }

    public static String readBook(Book book) {
        return book.toString();
    }

    public static Integer rateBook(Book book) {
        int name = book.getName().length();
        int author = book.getAuthor().length();
        int order = book.getOrder();
        int pages = book.getPages();
        int rate = name + author - order + pages;

        if (book.getName().equals("")) {
            Random random_name = new Random();
            int rname = random_name.nextInt(10);
            rate -= rname;
        }

        if (book.getAuthor().equals("")) {
            Random random_author = new Random();
            int rauthor = random_author.nextInt(10);
            rate -= rauthor;
        }

        if (book.getOrder() == 0) {
            Random random_order = new Random();
            int rorder = random_order.nextInt(10);
            rate -= rorder;
        }

        if (book.getPages() == 0) {
            Random random_pages = new Random();
            int rpages = random_pages.nextInt(10);
            rate -= rpages;
        }

        return rate;
    }
}


