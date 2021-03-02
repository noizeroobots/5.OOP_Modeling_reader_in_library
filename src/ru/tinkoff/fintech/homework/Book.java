package ru.tinkoff.fintech.homework;

public class Book {

    private String name;
    private String author;
    private int year;
    private int order;
    private int pages;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
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

