package ru.tinkoff.fintech.homework;

import java.util.Random;

public class Reader {

    public static Book[] book() {
        Book[] books = new Book[4];
        books[0] = new Book("Idiot", "Fedor Dostoevsky");
        books[1] = new Book("1984", "George Orwell", 1949);
        books[2] = new Book("Romeo and Juliet", "William Shakespeare", 1595, 318);
        books[3] = new Book("Master and Margarita", "Michail Bulgakov", 1920, 328, 1);
        return books;
    }

    public static Book choiceBook(Book[] books) {
        Random random = new Random();
        int index = random.nextInt(books.length);
        Book book = books[index];
        return book;
    }

    public static String readBook(Book book) { //В readBook нужно вызвать toString() у экземпляра Book
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
            System.out.println("the divided random from name is: " + rname);
            rate -= rname;
        }

        if (book.getAuthor().equals("")) {
            Random random_author = new Random();
            int rauthor = random_author.nextInt(10);
            System.out.println("the divided random from author is: " + rauthor);
            rate -= rauthor;
        }

        if (book.getOrder() == 0) {
            Random random_order = new Random();
            int rorder = random_order.nextInt(10);
            System.out.println("the divided random from order is: " + rorder);
            rate -= rorder;
        }

        if (book.getPages() == 0) {
            Random random_pages = new Random();
            int rpages = random_pages.nextInt(10);
            System.out.println("the divided random from pages is: " + rpages);
            rate -= rpages;
        }
        System.out.println("The rate is: " + rate);

        return rate;
    }
}


