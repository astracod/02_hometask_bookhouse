package com.company.bookhouse;

        /*библиотека должна предоставлять возможности:
        добавить новую книгу
        получить полный список книг
        получить все книги автора
        получить все книги по жанру
        получить все книги по жанру и автору
        получить книги за временной период (например изданные с 2010 по 2015)*/


import java.util.Arrays;

public class Vault {
    MyVector<Book> library;

    public Vault() {
        library = new MyVector<>();
        library.addValue(new Book("Жюль Верн", "фантастический роман", "Вокруг Луны", 1869));
        library.addValue(new Book("Джеймс Фенимор Купер", " исторический роман", "Последний из могикан", 1826));
        library.addValue(new Book("Джек Лондон", "детская литература", "Зов предков", 1903));
    }

    public void addBook(Book book) {
        library.addValue(book);
    }


    public void showAll() {
        for (int i = 0; i < library.size(); i++) {
            library.get(i).aboutYourself();
            System.out.printf("\n");
        }
    }

    public void showAuthor(String author) {
        System.out.println("------------------------------------");
        System.out.println(" Все книги по автору : ");
        System.out.println();
        MyVector<Book> authorArr = new MyVector<>();
        for (int i = 0; i < library.size(); i++) {

            if (library.get(i).trueAuthor(author)) {
                authorArr.addValue(library.get(i));
            }
        }
        for (int j = 0; j < authorArr.size(); j++) {
            authorArr.get(j).aboutYourself();
            System.out.printf("\n");

        }
    }

    public void showGenre(String genre) {
        System.out.println("------------------------------------");
        System.out.println(" Все книги по жанру : ");
        System.out.println();
        MyVector<Book> genreArr = new MyVector<>();
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).trueGenre(genre)) {
                genreArr.addValue(library.get(i));
            }
        }
        for (int j = 0; j < genreArr.size(); j++) {
            genreArr.get(j).aboutYourself();
            System.out.println("");
        }
    }

    public void showAuthorAndGenre(String author, String genre) {
        System.out.println("------------------------------------");
        System.out.println(" Все книги по автору и жанру : ");
        System.out.println();
        MyVector<Book> authorGenreArr = new MyVector<>();
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).trueAuthor(author) & library.get(i).trueGenre(genre)) {
                authorGenreArr.addValue(library.get(i));
            }
        }
        for (int i = 0; i < authorGenreArr.size(); i++) {
            authorGenreArr.get(i).aboutYourself();
            System.out.println();
        }
    }

    public void period(int start, int end){
        System.out.println("------------------------------------");
        System.out.println(" Все книги за указынный период времени : ");
        System.out.println();
        MyVector<Book> periodArr = new MyVector<>();
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).isPublisheInPeriod(start, end)){
                periodArr.addValue(library.get(i));
            }
        }
        for (int i = 0; i < periodArr.size(); i++) {
            periodArr.get(i).aboutYourself();
            System.out.println();
        }

    }

}
