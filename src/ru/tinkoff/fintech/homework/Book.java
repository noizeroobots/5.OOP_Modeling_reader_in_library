package ru.tinkoff.fintech.homework;

public class Book extends Main{

    String name;
    String author;
    int year;
    int order;
    int pages;

    public Book(String n, String a) {  //Перегруженный конструктор №1
        name = n;
        author = a;
    }
    public Book(String n, String a, int y) {  //Перегруженный конструктор №2
        name = n;
        author = a;
        year = y;
    }
    public Book(String n, String a, int y, int p) {  //Перегруженный конструктор №3
        name = n;
        author = a;
        year = y;
        pages = p;
    }
    public Book(String n, String a, int y, int p, int o) {  //Перегруженный конструктор №4
        name = n;
        author = a;
        year = y;
        pages = p;
        order = o;
    }

    @Override
    public String toString() {
        return author + " - " + name + ". - " + year + " г. - " + pages + " с. " + order + ". ";
    }

}
// Java-конструктор - это специальный метод, который вызывается при создании экземпляра класса.
//Book common = new Book("Idiot", "Dostoevsky", 1, 99);