package ru.tinkoff.fintech.homework;

public class Book {

    String name;
    String author;
    int year;
    int order;
    int pages;

    public Book(String name, String author) {  //Перегруженный конструктор №1
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int year) {  //Перегруженный конструктор №2
        this(name, author);
        this.year = year;
    }

    public Book(String name, String author, int year, int pages) {  //Перегруженный конструктор №3
        this(name, author, year);
        this.pages = pages;
    }

    public Book(String name, String author, int year, int pages, int order) {  //Перегруженный конструктор №4
        this(name, author, year, pages);
        this.order = order;
    }

    @Override
    public String toString() {
        return author + " - " + name + ". - " + year + " г. - " + pages + " с. " + order + ". ";
    }

}
// Java-конструктор - это специальный метод, который вызывается при создании экземпляра класса.
