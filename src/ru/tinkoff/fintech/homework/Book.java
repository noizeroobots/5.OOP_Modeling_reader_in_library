package ru.tinkoff.fintech.homework;

public class Book extends Main{

    String name;
    String author;
    int order;
    int pages;

    public Book(String n) {
        name = n;
    }
    public Book(String n, String a) {
        name = n;
        author = a;
    }

}
// Java-конструктор - это специальный метод, который вызывается при создании экземпляра класса.
//Book common = new Book("Idiot", "Dostoevsky", 1, 99);