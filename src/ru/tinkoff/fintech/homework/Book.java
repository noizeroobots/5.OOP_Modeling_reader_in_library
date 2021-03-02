package ru.tinkoff.fintech.homework;

public class Book {

    private final String name;
    private final String author;
    private int order;
    private int pages;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getOrder() {
        return order;
    }

    public int getPages() {
        return pages;
    }


    public Book(String name, String author) {  //Перегруженный конструктор №1
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int pages) {  //Перегруженный конструктор №2
        this(name, author);
        this.pages = pages;
    }

    public Book(String name, String author, int pages, int order) {  //Перегруженный конструктор №3
        this(name, author, pages);
        this.order = order;
    }

    @Override
    public String toString() {
        return author + "   \"" + name + "\", - " + pages + "стр. " + order + ". ";
    }

}

