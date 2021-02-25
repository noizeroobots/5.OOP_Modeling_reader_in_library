package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Idiot", "Fedor Dostoevsky");
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("Romeo and Juliet", "William Shakespeare", 1595, 318);
        Book book4 = new Book("Master and Margarita", "Michail Bulgakov", 1920, 328, 1);
        System.out.println(book1.toString()); // Переопределение метода toString для класса Book.
        System.out.println(book2.toString()); // Переопределение метода toString для класса Book.
        System.out.println(book3.toString()); // Переопределение метода toString для класса Book.
        System.out.println(book4.toString()); // Переопределение метода toString для класса Book.

        String[] list = new String[4]; // Из списка книг по их названию их же вытащил и создал массив
        list[0] = book1.name;
        list[1] = book2.name;
        list[2] = book3.name;
        list[3] = book4.name;
        for (int i = 0; i < 4; i++) {
            System.out.println("Book: " + list[i]);
        }


    }

}
