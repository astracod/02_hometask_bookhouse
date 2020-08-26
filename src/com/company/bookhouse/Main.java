package com.company.bookhouse;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Vault vault = new Vault();
        vault.addBook(new Book("Рэй Брэдбери", "фантастический роман", "Марсианские хроники", 1947));
        vault.addBook(new Book("Жюль Верн", "фантастический роман", "Путешествие к центру Земли", 1864));
        vault.addBook(new Book("Жюль Верн", "приключенческая повесть", "Зимовка во льдах", 1855));
        vault.showAll();
        vault.showAuthor("Жюль Верн");
        vault.showGenre("фантастический роман");
        vault.showAuthorAndGenre("Жюль Верн", "фантастический роман");
        vault.period(1800,1900);
    }
}