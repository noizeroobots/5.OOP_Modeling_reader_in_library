package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Idiot");
        System.out.println(book1.name);
        Book book2 = new Book("1984", "George Orwell");
        System.out.println(book2.name + " " + book2.author);
        Book book3 = new Book("Romeo and Juliet");
        System.out.println(book3.name);
    }
}
