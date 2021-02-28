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
        String[] list = new String[4];
        Reader.choiceBook(list);


        while (action1.indexOf("f") == -1) {
            for (int i = 0; i < f.length(); i++) {

                Book book1 = new Book("Idiot", "Fedor Dostoevsky");
                Book book2 = new Book("1984", "George Orwell", 1949);
                Book book3 = new Book("Romeo and Juliet", "William Shakespeare", 1595, 318);
                Book book4 = new Book("Master and Margarita", "Michail Bulgakov", 1920, 328, 1);

                list[0] = book1.name;
                list[1] = book2.name;
                list[2] = book3.name;
                list[3] = book4.name;
            }
            return;
        }

    }
}